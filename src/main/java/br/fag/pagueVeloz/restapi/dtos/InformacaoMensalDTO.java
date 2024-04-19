package br.fag.pagueVeloz.restapi.dtos;

import br.fag.pagueVeloz.restapi.entities.TypeInsalubridade;

public record InformacaoMensalDTO (
        Double salarioBruto,
        Double horasEtras,
        Double adicionalNoturno,
        Double faltasAtrasos,
        Double adiantamento,
        Boolean sindical,
        Boolean viagem,
        TypeInsalubridade grauInsalubridade,
        Boolean periculosidade
){
}
