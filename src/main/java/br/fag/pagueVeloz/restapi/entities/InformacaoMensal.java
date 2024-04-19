package br.fag.pagueVeloz.restapi.entities;

import br.fag.pagueVeloz.restapi.dtos.InformacaoMensalDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InformacaoMensal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double salarioBruto;
    private Double jornadaDeTrabalho = 192.0;
    private Double horasExtras;
    private Double adicionalNoturno;
    private Double faltasAtrasos;
    private Double adiantamento;
    private Boolean sindical;
    private Boolean viagem;
    private TypeInsalubridade grauInsalubridade;
    private Boolean periculosidade;
    private Double valeAlimentacao = 220.00;
    private Double valeTransporte = 300.00;


    public InformacaoMensal(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public InformacaoMensal(InformacaoMensalDTO dto){
        this.salarioBruto = dto.salarioBruto();
        this.horasExtras = dto.horasEtras();
        this.adicionalNoturno = dto.adicionalNoturno();
        this.faltasAtrasos = dto.faltasAtrasos();
        this.adiantamento = dto.adiantamento();
        this.sindical = dto.sindical();
        this.viagem = dto.viagem();
        this.grauInsalubridade = dto.grauInsalubridade();
        this.periculosidade = dto.periculosidade();
    }
}