package br.fag.pagueVeloz.restapi.infra.repositories;

import br.fag.pagueVeloz.restapi.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    Optional<Funcionario> findByCpf(String cpf);
}
