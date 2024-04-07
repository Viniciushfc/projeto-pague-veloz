package br.fag.pagueVeloz.entities;

import br.fag.pagueVeloz.dtos.FuncionarioDTO;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "funcionario")
@Table(name = "funcionario")
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
    private LocalTime dataAniversario;

    @Nullable
    @ManyToOne
    private Dependente dependentes;

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
        this.typeSexo  = dto.typeSexo();
        this.dataAniversario = dto.dataAniversario();
        this.endereco = dto.endereco();
        this.typeCategoriaSegurados = dto.typeCategoriaSegurados();
        this.informacaoMensal = dto.informacaoMensal();
    }
}
