package br.fag.pagueVeloz.restapi.dtos;

import br.fag.pagueVeloz.restapi.entities.*;

import java.time.LocalDate;

public record FuncionarioDTO(
        String nome,
        String rg,
        String cpf,
        TypeCargo typeCargo,
        String funcao,
        TypePeriodo typePeriodo,
        TypeSexo typeSexo,
        LocalDate dataAniversario,
        Endereco endereco,
        TypeCategoriaSegurados typeCategoriaSegurados
        ) {

}
