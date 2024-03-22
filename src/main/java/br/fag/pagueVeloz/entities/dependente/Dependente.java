package br.fag.pagueVeloz.entities.dependente;

import br.fag.pagueVeloz.dtos.DependenteDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "dependentes")
public class Dependente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cpfResponsavel;
    private String nomeDependente;
    @Column(unique = true)
    private String cpf;

    private int idade;

    public Dependente(DependenteDTO dto) {
        this.cpfResponsavel = dto.cpfResponsavel();
        this.nomeDependente = dto.nomeDependente();
        this.cpf = dto.cpf();
        this.idade = dto.idade();
    }
}
