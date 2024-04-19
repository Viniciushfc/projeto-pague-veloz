package br.fag.pagueVeloz.restapi.entities;

import br.fag.pagueVeloz.restapi.dtos.FuncionarioDTO;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean ativo;
    private String nome;

    @Column(unique = true)
    private String rg;
    @Column(unique = true)
    private String cpf;

    private TypeCargo typeCargo;
    private String funcao;
    private TypePeriodo typePeriodo;
    private TypeSexo typeSexo;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dataAniversario;
    private LocalDate registrado = LocalDate.now();

    @Nullable
    @OneToMany
    private List<Dependente> dependentes;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    private TypeCategoriaSegurados typeCategoriaSegurados;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "informacao_pagamento_id")
    private InformacaoMensal informacaoMensal;


    public Funcionario(FuncionarioDTO dto) {
        this.nome = dto.nome();
        this.rg = dto.rg();
        this.cpf = dto.cpf();
        this.typeCargo = dto.typeCargo();
        this.funcao = dto.funcao();
        this.typePeriodo = dto.typePeriodo();
        this.typeSexo  = dto.typeSexo();
        this.dataAniversario = dto.dataAniversario();
        this.endereco = dto.endereco();
        this.typeCategoriaSegurados = dto.typeCategoriaSegurados();
    }
}
