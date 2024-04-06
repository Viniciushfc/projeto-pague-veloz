package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.entities.Funcionario;
import br.fag.pagueVeloz.exceptions.NotFoundException;
import br.fag.pagueVeloz.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DescontosService {

    //INSS, IRRF, SINCICAL
    @Autowired
    private FuncionarioRepository funcionarioRepository;


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
}
