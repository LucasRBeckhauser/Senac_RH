package br.com.portalRH.PortalRh.services;

import br.com.portalRH.PortalRh.model.Funcionario;
import br.com.portalRH.PortalRh.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public Funcionario salvar(Funcionario entity) {


        // Regras de negócio

        return repository.save(entity);
    }

    public List<Funcionario> trazerTodos() { return repository.findAll(); }

    public Funcionario trazerporId(Long id) {return repository.findById(id).orElse(null);}

    public void removerFuncionario(Long id) {repository.deleteById(id);}

    public Funcionario alterarFuncionario(Long id, Funcionario entity) {
        Optional<Funcionario> porId = repository.findById(id);

        if(porId.isPresent()){
            Funcionario funcionario = porId.get();

            //funcionario.setAtributo(entity.geAtributo()); (Adaptar)

            return repository.save(funcionario);
        }
        return null;

    }
}
