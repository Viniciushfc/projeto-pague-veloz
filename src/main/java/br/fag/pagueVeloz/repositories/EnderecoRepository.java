package br.fag.pagueVeloz.repositories;

import br.fag.pagueVeloz.entities.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
