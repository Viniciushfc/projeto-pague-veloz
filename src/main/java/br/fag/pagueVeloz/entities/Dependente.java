package br.fag.pagueVeloz.entities;

import br.fag.pagueVeloz.dtos.DependenteDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "dependentes")
public class Dependente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Boolean ativo;
    private String cpfResponsavel;
    private String nomeDependente;
    private String grauDeParentesco;
    @Column(unique = true)
    private String cpf;

    private LocalDate dataNascimento;

    public Dependente(DependenteDTO dto) {
        this.cpfResponsavel = dto.cpfResponsavel();
        this.nomeDependente = dto.nomeDependente();
        this.cpf = dto.cpf();
        this.grauDeParentesco = dto.grauDeParentesco();
        this.dataNascimento = dto.dataNascimento();
    }


}
