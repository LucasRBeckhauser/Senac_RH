package br.com.portalRH.PortalRh.resources;

import br.com.portalRH.PortalRh.model.Funcionario;
import br.com.portalRH.PortalRh.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
        @Autowired
        private FuncionarioService service;

        @PostMapping
        public ResponseEntity create(@RequestBody Funcionario entity) {
            Funcionario save = service.salvar(entity);
            return ResponseEntity.created(URI.create("/funcionario" + entity.getId())).body(save);
        }

        @GetMapping
        public ResponseEntity findAll(){
            List<Funcionario> funcionario = service.trazerTodos();
            return ResponseEntity.ok(funcionario);
        }

        @GetMapping ("{id}")
        public ResponseEntity findById(@PathVariable ("id") Long id) {
            Funcionario funcionario = service.trazerporId(id);
            return ResponseEntity.ok(funcionario);}

        @PutMapping("{id}")
        public  ResponseEntity update(@PathVariable("id") Long id, @RequestBody Funcionario entity) {
            Funcionario alterado = service.alterarFuncionario(id, entity);
            return ResponseEntity.ok().body(alterado);
        }

        @DeleteMapping("{id}")
        public ResponseEntity remove(@PathVariable("id") Long id) {
            service.removerFuncionario(id);
            return ResponseEntity.noContent().build();
        }
}
