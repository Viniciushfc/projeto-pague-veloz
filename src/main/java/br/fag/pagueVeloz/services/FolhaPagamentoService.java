package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.entities.FolhaPagamento;
import br.fag.pagueVeloz.entities.Funcionario;
import br.fag.pagueVeloz.exceptions.NotFoundException;
import br.fag.pagueVeloz.repositories.FolhaPagamentoRepository;
import br.fag.pagueVeloz.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        //Descontos
        Double inss = descontosService.calcularInss(id);
        folhaPagamento.setInss(inss);
        folhaPagamento.setIrrf(descontosService.calcularIrrf(id,inss));
        folhaPagamento.setSindical(descontosService.calcularSindical(id));
        folhaPagamento.setValeAlimentacao(descontosService.calcularValeAlimentacao(id));
        folhaPagamento.setValeTransport(descontosService.calcularValeTransporte(id));

        //Beneficios
        folhaPagamento.setHoraExtra(beneficioService.horaExtra(id));
        folhaPagamento.setDsr(beneficioService.calcularDSR(id));
        folhaPagamento.setNoturno(beneficioService.calcularNoturno(id));
        folhaPagamento.setInsalubridade(beneficioService.calcularInsalubridade(id));
        folhaPagamento.setPericulosidade(beneficioService.calcularPericulosidade(id));
        folhaPagamento.setSalarioFamilia(beneficioService.calcularSalarioFamilia(id));
        folhaPagamento.setDiariasViagens(beneficioService.calcularAdicional(id));
        folhaPagamento.setAdicional(beneficioService.calcularDiariasViagens(id));
        folhaPagamento.setAuxilioCreche(beneficioService.calcularAuxilioCreche(id));

        folhaPagamentoRepository.save(folhaPagamento);

        return folhaPagamento;
    }
}
