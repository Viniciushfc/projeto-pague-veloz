package br.fag.pagueVeloz.repositories;

import br.fag.pagueVeloz.entities.funcionario.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    Optional<Funcionario> findByCpf(String cpf);
}
