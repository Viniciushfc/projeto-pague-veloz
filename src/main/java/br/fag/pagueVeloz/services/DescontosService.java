package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.entities.Dependente;
import br.fag.pagueVeloz.entities.Funcionario;
import br.fag.pagueVeloz.exceptions.NotFoundException;
import br.fag.pagueVeloz.repositories.DependenteRepository;
import br.fag.pagueVeloz.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DescontosService {

    //INSS ok , IRRF ok , SINCICAL ok, valeA 6% ok valeT10%

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private DependenteRepository dependenteRepository;

    //calcular o INSS.
    public Double calcularInss(Long id) throws NotFoundException {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();

        Double salarioBruto = funcionario.getInformacaoMensal().getSalarioBruto();

        if (salarioBruto <= 1751.81) {
            return salarioBruto * 0.08;
        } else if (salarioBruto <= 2919.72) {
            return salarioBruto * 0.09;
        } else if (salarioBruto <= 5839.45) {
            return salarioBruto * 0.11;
        } else {
            return 642.34;
        }
    }

    public Double calcularFgts(Long id) throws NotFoundException {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();

        Double salarioBruto = funcionario.getInformacaoMensal().getSalarioBruto();

        double depositoMensal = salarioBruto * 0.08;

        return depositoMensal;
    }

    //precisa fazer o calculo do INSS e PENSAOALIMENTICIA antes para agregar no IRRF.
    public Double calcularIrrf(Long id, Double inss) throws NotFoundException {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();

        Double salarioBruto = funcionario.getInformacaoMensal().getSalarioBruto();
        int numeroDependentes = funcionario.getDependentes().size();

        double calculo = salarioBruto - inss - (numeroDependentes * 189.59);

        Double imposto;

        if (calculo <= 1903.98) {
            return imposto = 0.0;
        } else if (calculo <= 2826.65) {
            return imposto = (calculo - 1903.98) * 0.075;
        } else if (calculo <= 3751.05) {
            return imposto = (calculo - 2826.65) * 0.15;
        } else if (calculo <= 4664.68) {
            return imposto = (calculo - 3751.05) * 0.225;
        } else {
            return imposto = (calculo - 4664.68) * 0.275;
        }
    }

    public Double calcularSindical(Long id) throws NotFoundException {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();
        if (funcionario.getInformacaoMensal().getSindical() == true) {
            Double salarioBruto = funcionario.getInformacaoMensal().getSalarioBruto();

            return salarioBruto * 0.5 / 100;
        }

        return 0.0;
    }

    public Double calcularValeAlimentacao(Long id) throws NotFoundException {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();
        Double salarioBruto = funcionario.getInformacaoMensal().getSalarioBruto();
        Double valeAlimentacao = funcionario.getInformacaoMensal().getValeAlimentacao();

        if (valeAlimentacao <= salarioBruto * 0.06) {
            return valeAlimentacao;
        } else {
            return salarioBruto * 0.06;
        }
    }

    public Double calcularValeTransporte(Long id) throws NotFoundException {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();
        Double salarioBruto = funcionario.getInformacaoMensal().getSalarioBruto();

        if (salarioBruto * 0.1 <= 300.00) {
            return salarioBruto * 0.1;
        } else {
            return 300.00;
        }
    }

}

