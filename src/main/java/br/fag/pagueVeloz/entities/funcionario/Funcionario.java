package br.fag.pagueVeloz.entities.funcionario;

import br.fag.pagueVeloz.dtos.FuncionarioDTO;
import br.fag.pagueVeloz.entities.categoriaSegurados.TypeCategoriaSegurados;
import br.fag.pagueVeloz.entities.dependente.Dependente;
import br.fag.pagueVeloz.entities.endereco.Endereco;
import br.fag.pagueVeloz.entities.informacaoPagamento.InformacaoPagamento;
import br.fag.pagueVeloz.entities.sexo.TypeSexo;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

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
    private InformacaoPagamento informacaoPagamento;


    public Funcionario(FuncionarioDTO dto) {
        this.nome = dto.nome();
        this.rg = dto.rg();
        this.cpf = dto.cpf();
        this.typeSexo  = dto.typeSexo();
        this.dataAniversario = dto.dataAniversario();
        this.endereco = dto.endereco();
        this.typeCategoriaSegurados = dto.typeCategoriaSegurados();
        this.informacaoPagamento = dto.informacaoPagamento();
    }
}
