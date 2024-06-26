package br.fag.pagueVeloz.restapi.services;

import br.fag.pagueVeloz.restapi.entities.Funcionario;
import br.fag.pagueVeloz.restapi.entities.TypeInsalubridade;
import br.fag.pagueVeloz.restapi.entities.TypePeriodo;
import br.fag.pagueVeloz.restapi.infra.exceptions.NotFoundException;
import br.fag.pagueVeloz.restapi.infra.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class BeneficioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Double calcularHoraExtra(Funcionario funcionario) throws NotFoundException {
        Double salarioBruto = funcionario.getInformacaoMensal().getSalarioBruto();
        Double jornadaTrabalho = funcionario.getInformacaoMensal().getJornadaDeTrabalho();
        Double salarioHora = salarioBruto / jornadaTrabalho;
        Double valorHoraExtra = 0.0;

        if (funcionario.getTypePeriodo() == TypePeriodo.NOTURNO) {
            valorHoraExtra = salarioHora * (1 + 1);
        } else if (funcionario.getTypePeriodo() == TypePeriodo.MATUTINO) {
            valorHoraExtra = salarioHora * (1 + 0.5);
        }

        Double totHorasExtras = funcionario.getInformacaoMensal().getHorasExtras() * valorHoraExtra;
        return totHorasExtras;
    }

    public Double calcularDSR(Funcionario funcionario) throws NotFoundException {

        Double salarioBruto = funcionario.getInformacaoMensal().getSalarioBruto();
        Double jornadaTrabalho = funcionario.getInformacaoMensal().getJornadaDeTrabalho();
        Double salarioHora = salarioBruto / jornadaTrabalho;

        Double valorDSR = (salarioHora * 8) * 4;
        return valorDSR;
    }

    public Double calcularNoturno(Funcionario funcionario) throws NotFoundException {

        if (funcionario.getTypePeriodo() == TypePeriodo.NOTURNO) {
            Double salarioBruto = funcionario.getInformacaoMensal().getSalarioBruto();
            Double jornadaTrabalho = funcionario.getInformacaoMensal().getJornadaDeTrabalho();
            Double salarioHora = salarioBruto / jornadaTrabalho;

            Double valorNoturno = salarioHora * 1.2;
            return valorNoturno;
        }

        return 0.0;
    }

    public Double calcularInsalubridade(Funcionario funcionario) throws NotFoundException {

        Double salarioMinimo = 1300.0;

        if (!funcionario.getInformacaoMensal().getPericulosidade()) {
            if (funcionario.getInformacaoMensal().getGrauInsalubridade() == TypeInsalubridade.GRAU1) {
                Double valorInsalubridade = salarioMinimo * 0.1;
                return valorInsalubridade;
            } else if (funcionario.getInformacaoMensal().getGrauInsalubridade() == TypeInsalubridade.GRAU2) {
                Double valorInsalubridade = salarioMinimo * 0.2;
                return valorInsalubridade;
            } else if (funcionario.getInformacaoMensal().getGrauInsalubridade() == TypeInsalubridade.GRAU3) {
                Double valorInsalubridade = salarioMinimo * 0.4;
                return valorInsalubridade;
            }
        }

        return 0.0;
    }

    public Double calcularPericulosidade(Funcionario funcionario) throws NotFoundException {

        Double salarioBruto = funcionario.getInformacaoMensal().getSalarioBruto();

        if (funcionario.getInformacaoMensal().getGrauInsalubridade() == TypeInsalubridade.GRAU0 && funcionario.getInformacaoMensal().getPericulosidade()) {
            Double valorPericulosidade = salarioBruto * 1.3;
            return valorPericulosidade;
        }

        return 0.0;
    }

    public Double calcularSalarioFamilia(Funcionario funcionario) throws NotFoundException {

        Double unitFilho = (1300.0 / 100) * 5;

        long qntFilhos = funcionario.getDependentes().stream()
                .filter(dependente -> dependente.getDataNascimento().isAfter(LocalDate.now().minusDays(5040)))
                .count();

        return unitFilho * qntFilhos;

    }

    public Double calcularDiariasViagens(Funcionario funcionario) throws NotFoundException {

        Double salarioBruto = funcionario.getInformacaoMensal().getSalarioBruto();
        if (funcionario.getInformacaoMensal().getViagem()) {
            Double valorDiariaViagem = salarioBruto * 0.5;

            return valorDiariaViagem;
        }
        return 0.0;
    }

    public Double calcularAdicional(Funcionario funcionario) throws NotFoundException {
        LocalDate hoje = LocalDate.now();
        LocalDate diasRegistrado = funcionario.getRegistrado();

        long diasEmpregado = ChronoUnit.DAYS.between(diasRegistrado, hoje);

        if (diasEmpregado == 2880) {
            return 1500.0;
        }
        return 0.0;

    }

    public Double calcularAuxilioCreche(Funcionario funcionario) throws NotFoundException {

        Double unitFilho = 400.0;

        long qntFilhos = funcionario.getDependentes().stream()
                .filter(dependente -> dependente.getDataNascimento().isAfter(LocalDate.now().minusDays(180)))
                .count();

        return unitFilho * qntFilhos;

    }

}