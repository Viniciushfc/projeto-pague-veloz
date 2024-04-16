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

        Funcionario funcionarioFind = optionalFuncionario.get();
        //Descontos
        Double inss = descontosService.calcularInss(funcionarioFind);
        Double fgts = descontosService.calcularFgts(funcionarioFind);
        Double irrf = descontosService.calcularIrrf(funcionarioFind, inss);
        Double sindical = descontosService.calcularSindical(funcionarioFind);
        Double valeAlimentacao = descontosService.calcularValeAlimentacao(funcionarioFind);
        Double valeTransport = descontosService.calcularValeTransporte(funcionarioFind);

        Double descontosTotal = inss + fgts + irrf + sindical + valeAlimentacao + valeTransport;

        //Benefícios
        Double horaExtra = beneficioService.calcularHoraExtra(funcionarioFind);
        Double dsr = beneficioService.calcularDSR(funcionarioFind);
        Double noturno = beneficioService.calcularNoturno(funcionarioFind);
        Double insalubridade = beneficioService.calcularInsalubridade(funcionarioFind);
        Double periculosidade = beneficioService.calcularPericulosidade(funcionarioFind);
        Double salarioFamilia = beneficioService.calcularSalarioFamilia(funcionarioFind);
        Double diariasViagens = beneficioService.calcularDiariasViagens(funcionarioFind);
        Double adicional = beneficioService.calcularAdicional(funcionarioFind);
        Double auxilioCreche = beneficioService.calcularAuxilioCreche(funcionarioFind);

        Double beneficiosTotal = horaExtra + dsr + noturno + insalubridade + periculosidade +
                salarioFamilia + diariasViagens + adicional + auxilioCreche;


        Double salarioBruto = optionalFuncionario.get().getInformacaoMensal().getSalarioBruto();

        Double salarioLiquido = salarioBruto - descontosTotal + beneficiosTotal;

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
        folhaPagamento.setSalarioBruto(optionalFuncionario.get().getInformacaoMensal().getSalarioBruto());
        folhaPagamento.setSalarioLiquido(salarioLiquido);

        folhaPagamentoRepository.save(folhaPagamento);

        return folhaPagamento;
    }
}
