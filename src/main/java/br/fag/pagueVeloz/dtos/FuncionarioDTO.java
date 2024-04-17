package br.fag.pagueVeloz.dtos;

import br.fag.pagueVeloz.entities.*;

import java.time.LocalDate;
import java.time.LocalTime;

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
