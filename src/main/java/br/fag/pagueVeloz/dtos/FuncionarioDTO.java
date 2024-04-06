package br.fag.pagueVeloz.dtos;

import br.fag.pagueVeloz.entities.*;

import java.time.LocalTime;

public record FuncionarioDTO(
        String nome,
        String rg,
        String cpf,
        TypeCargo typeCargo,
        String funcao,
        TypeSexo typeSexo,
        LocalTime dataAniversario,
        Endereco endereco,
        TypeCategoriaSegurados typeCategoriaSegurados,
        InformacaoMensal informacaoMensal
        ) {

}
