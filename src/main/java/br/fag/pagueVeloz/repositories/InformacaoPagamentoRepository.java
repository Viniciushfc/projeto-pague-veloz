package br.fag.pagueVeloz.repositories;

import br.fag.pagueVeloz.entities.informacaoPagamento.InformacaoPagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformacaoPagamentoRepository extends JpaRepository<InformacaoPagamento, Long> {
}
