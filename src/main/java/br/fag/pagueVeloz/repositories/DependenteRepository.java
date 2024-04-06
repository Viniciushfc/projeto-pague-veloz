package br.fag.pagueVeloz.repositories;

import br.fag.pagueVeloz.entities.Dependente;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DependenteRepository extends JpaRepository<Dependente, Long> {

    Optional<Dependente> findByCpf(String cpf);
}
