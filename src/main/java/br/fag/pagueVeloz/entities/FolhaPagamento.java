package br.fag.pagueVeloz.entities;

import br.fag.pagueVeloz.services.BeneficioService;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FolhaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private final String nomeEmpregador = "Gerador de Folha Pagamento";
    private final String cnpjEmpregador = "XX.XXX.XXX/0001-XX";
    private final String enderecoEmpregador = "Rua tal, Bairro: tal, Número 000, Cidade do Lá, CEP: 65655-545";
    private final String nomeFantasiaEmpresa = "PagueVeloz";
    private final String setorEmpresa = "Gestão";
    private Long idFuncionario;
    private Double inss ;
    private Double irrf;
    private Double sindical;
    private Double valeAlimentacao;
    private Double valeTransport;
    private Double horaExtra;
    private Double dsr;
    private Double noturno;
    private Double insalubridade;
    private Double periculosidade;
    private Double salarioFamilia;
    private Double diariasViagens;
    private Double adicional;
    private Double auxilioCreche;


}
