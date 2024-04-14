package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.entities.FolhaPagamento;
import br.fag.pagueVeloz.entities.Funcionario;
import br.fag.pagueVeloz.exceptions.NotFoundException;
import br.fag.pagueVeloz.repositories.FolhaPagamentoRepository;
import br.fag.pagueVeloz.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class FolhaPagamentoService {

    @Autowired
    private FolhaPagamentoRepository folhaPagamentoRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private BeneficioService beneficioService;

    @Autowired
    private DescontosService descontosService;

    public FolhaPagamento gerarFolhaPagamento(Long id) throws NotFoundException {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        //Descontos
        Double inss = descontosService.calcularInss(id);
        Double fgts = descontosService.calcularFgts(id);
        Double irrf = descontosService.calcularIrrf(id, inss);
        Double sindical = descontosService.calcularSindical(id);
        Double valeAlimentacao = descontosService.calcularValeAlimentacao(id);
        Double valeTransport = descontosService.calcularValeTransporte(id);

        Double descontosTotal = inss + fgts + irrf + sindical + valeAlimentacao + valeTransport;

        //Benefícios
        Double horaExtra = beneficioService.horaExtra(id);
        Double dsr = beneficioService.calcularDSR(id);
        Double noturno = beneficioService.calcularNoturno(id);
        Double insalubridade = beneficioService.calcularInsalubridade(id);
        Double periculosidade = beneficioService.calcularPericulosidade(id);
        Double salarioFamilia = beneficioService.calcularSalarioFamilia(id);
        Double diariasViagens = beneficioService.calcularDiariasViagens(id);
        Double adicional = beneficioService.calcularAdicional(id);
        Double auxilioCreche = beneficioService.calcularAuxilioCreche(id);

        Double beneficiosTotal = horaExtra + dsr + noturno + insalubridade + periculosidade +
                salarioFamilia + diariasViagens + adicional + auxilioCreche;


        Double salarioBruto = optionalFuncionario.get().getInformacaoMensal().getSalarioBruto();

        Double salarioLiquido =  salarioBruto - descontosTotal + beneficiosTotal;

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.setIdFuncionario(optionalFuncionario.get().getId());
        folhaPagamento.setFuncaoFuncionario(optionalFuncionario.get().getFuncao());
        folhaPagamento.setCargoFuncionario(optionalFuncionario.get().getTypeCargo());
        folhaPagamento.setCategoriaFuncionario(optionalFuncionario.get().getTypeCategoriaSegurados());
        folhaPagamento.setInss(inss);
        folhaPagamento.setFgts(fgts);
        folhaPagamento.setIrrf(irrf);
        folhaPagamento.setSindical(sindical);
        folhaPagamento.setValeAlimentacao(valeAlimentacao);
        folhaPagamento.setValeTransport(valeTransport);
        folhaPagamento.setHoraExtra(horaExtra);
        folhaPagamento.setDsr(dsr);
        folhaPagamento.setNoturno(noturno);
        folhaPagamento.setInsalubridade(insalubridade);
        folhaPagamento.setPericulosidade(periculosidade);
        folhaPagamento.setSalarioFamilia(salarioFamilia);
        folhaPagamento.setDiariasViagens(diariasViagens);
        folhaPagamento.setAdicional(adicional);
        folhaPagamento.setAuxilioCreche(auxilioCreche);
        folhaPagamento.setSalarioLiquido(salarioLiquido);

        folhaPagamentoRepository.save(folhaPagamento);

        return folhaPagamento;
    }
}
