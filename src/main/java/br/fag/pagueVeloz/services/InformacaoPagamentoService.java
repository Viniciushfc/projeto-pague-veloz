package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.entities.funcionario.Funcionario;
import br.fag.pagueVeloz.entities.informacaoPagamento.InformacaoPagamento;
import br.fag.pagueVeloz.exceptions.NotFoundException;
import br.fag.pagueVeloz.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InformacaoPagamentoService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Double calcularHorasExtras(Long id) throws NotFoundException {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(
                this.funcionarioRepository.findById(id)
                        .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();

        Double horasTrabalhadas = funcionario.getInformacaoPagamento().getHorasTrabalhadas();
        Double jornadaDeTrabalho = funcionario.getInformacaoPagamento().getJornadaDeTrabalho();
        Double salarioBruto = funcionario.getInformacaoPagamento().getSalarioBruto();
        Double salarioHora = salarioBruto / jornadaDeTrabalho;

        //ver pra criar horas noturnas/feriado/domingos
        Double totalHoraExtra = horasTrabalhadas - jornadaDeTrabalho;
        Double valorHoraExtra = salarioHora * (1.0 + funcionario.getInformacaoPagamento().getPercentualAdicional() / 100.0);

        Double result = totalHoraExtra * valorHoraExtra;

        return result;
    }
}
