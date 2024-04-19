package br.fag.pagueVeloz.restapi.dtos;

import java.time.LocalDate;

public record DependenteDTO(
        String cpfResponsavel,
        String nomeDependente,
        String cpf,
        String grauDeParentesco,
        LocalDate dataNascimento
        ) {
}
