package br.fag.pagueVeloz.dtos;

import java.time.LocalDate;

public record DependenteDTO(
        String cpfResponsavel,
        String nomeDependente,
        String cpf,
        String grauDeParentesco,
        LocalDate dataNascimento
        ) {
}
