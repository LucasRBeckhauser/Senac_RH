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

            funcionario.setCargo(entity.getCargo());
            funcionario.setCpf(entity.getCpf());
            funcionario.setRg(entity.getRg());
            funcionario.setNome(entity.getNome());
            funcionario.setEndereco(entity.getEndereco());
            funcionario.setCtps(entity.getCtps());
            funcionario.setSalario(entity.getSalario());
            funcionario.setTituloEleitor(entity.getTituloEleitor());
            funcionario.setDataNascimento(entity.getDataNascimento());
            funcionario.setCarteiraReservista(entity.getCarteiraReservista());
            funcionario.setPisPasep(entity.getPisPasep());
            funcionario.setRegistroProfissional(entity.getRegistroProfissional());
            funcionario.setSindicato(entity.getSindicato());
            funcionario.setSetor(entity.getSetor());
            funcionario.setCnh(entity.getCnh());
            funcionario.setDataAdimissao(entity.getDataAdimissao());
            funcionario.setRacaCor(entity.getRacaCor());
            funcionario.setReligiao(entity.getReligiao());
            funcionario.setDoadorSangue(entity.getDoadorSangue());
            funcionario.setCertificacoes(entity.getCertificacoes());
            funcionario.setNacionalidade(entity.getNacionalidade());
            funcionario.setRedeSocial(entity.getRedeSocial());
            funcionario.setAreaAtuacao(entity.getAreaAtuacao());
            funcionario.setMatricula(entity.getMatricula());
            funcionario.setExpAnteriores(entity.getExpAnteriores());
            funcionario.setIdiomas(entity.getIdiomas());
            funcionario.setHoraExtra(entity.getHoraExtra());
            funcionario.setEntrada(entity.getEntrada());
            funcionario.setSaida(entity.getSaida());
            funcionario.setEscolaridade(entity.getEscolaridade());
            funcionario.setEstadoCivil(entity.getEstadoCivil());
            funcionario.setGenero(entity.getGenero());
            funcionario.setModalidadeContratual(entity.getModalidadeContratual());
            funcionario.setStatus(entity.getStatus());
            funcionario.setTipoConta(entity.getTipoConta());
            funcionario.setTipoRH(entity.getTipoRH());
            funcionario.setTurno(entity.getTurno());

            return repository.save(funcionario);
        }
        return null;

    }
}
