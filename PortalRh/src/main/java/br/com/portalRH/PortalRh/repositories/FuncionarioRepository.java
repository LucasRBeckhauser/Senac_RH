package br.com.portalRH.PortalRh.repositories;

import br.com.portalRH.PortalRh.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario, Long> {

}
