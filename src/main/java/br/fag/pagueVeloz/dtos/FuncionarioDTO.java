package br.fag.pagueVeloz.dtos;

import br.fag.pagueVeloz.entities.categoriaSegurados.TypeCategoriaSegurados;
import br.fag.pagueVeloz.entities.endereco.Endereco;
import br.fag.pagueVeloz.entities.informacaoPagamento.InformacaoPagamento;
import br.fag.pagueVeloz.entities.sexo.TypeSexo;

import java.time.LocalTime;

public record FuncionarioDTO(
        String nome,
        String rg,
        String cpf,
        TypeSexo typeSexo,
        LocalTime dataAniversario,
        Endereco endereco,
        TypeCategoriaSegurados typeCategoriaSegurados,
        InformacaoPagamento informacaoPagamento
        ) {
}
