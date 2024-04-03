package br.fag.pagueVeloz.entities.informacaoPagamento;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "inforacao_pagamento")
public class InformacaoPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double jornadaDeTrabalho;
    private Double salarioBruto;
    private Double horasTrabalhadas;
    private Double percentualHoraExtra;  //adicionado
    private Double valorValeTransporte;
    private Double valorValeAlimentacao;
}
