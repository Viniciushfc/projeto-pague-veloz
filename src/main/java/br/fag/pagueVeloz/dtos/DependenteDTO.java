package br.fag.pagueVeloz.dtos;

import java.time.LocalDateTime;

public record DependenteDTO(
        String cpfResponsavel,
        String nomeDependente,
        String cpf,
        String grauDeParentesco,
        LocalDateTime dataNascimento
        ) {
}
