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

    //INSS ok , IRRF, SINCICAL valeA 6% valeT10%

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

    //precisa fazer o calculo do INSS e PENSAOALIMENTICIA antes para agregar no IRRF.
    public Double calcularIrrf(Long id, Double inss, Double pensaoAlimenticia) throws NotFoundException {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();

        Double salarioBruto = funcionario.getInformacaoMensal().getSalarioBruto();
        int numeroDependentes = funcionario.getDependentes().size();

        Double baseCalculo = salarioBruto - inss - (numeroDependentes * 189.59) - pensaoAlimenticia;

        Double imposto;

        if (baseCalculo <= 1903.98) {
            return imposto = 0.0;
        } else if (baseCalculo <= 2826.65) {
            return imposto = (baseCalculo - 1903.98) * 0.075;
        } else if (baseCalculo <= 3751.05) {
            return imposto = (baseCalculo - 2826.65) * 0.15;
        } else if (baseCalculo <= 4664.68) {
            return imposto = (baseCalculo - 3751.05) * 0.225;
        } else {
            return imposto = (baseCalculo - 4664.68) * 0.275;
        }
    }

}
