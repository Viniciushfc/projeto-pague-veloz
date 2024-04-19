package br.fag.pagueVeloz.restapi.infra.repositories;

import br.fag.pagueVeloz.restapi.entities.FolhaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolhaPagamentoRepository extends JpaRepository<FolhaPagamento, Long> {
}
