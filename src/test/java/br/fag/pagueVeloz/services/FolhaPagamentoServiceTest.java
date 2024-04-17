package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.dtos.FuncionarioDTO;
import br.fag.pagueVeloz.entities.*;
import br.fag.pagueVeloz.exceptions.NotFoundException;
import br.fag.pagueVeloz.repositories.FolhaPagamentoRepository;
import br.fag.pagueVeloz.repositories.FuncionarioRepository;
import br.fag.pagueVeloz.services.FolhaPagamentoService;
import br.fag.pagueVeloz.services.BeneficioService;
import br.fag.pagueVeloz.services.DescontosService;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

// Anotações para o JUnit 5


public class FolhaPagamentoServiceTest {

    @Mock
    private FuncionarioRepository funcionarioRepository;

    @Mock
    private FolhaPagamentoRepository folhaPagamentoRepository;

    @Mock
    private BeneficioService beneficioService;

    @Mock
    private DescontosService descontosService;

    @Autowired
    private FolhaPagamentoService folhaPagamentoService;


    @Test
    public void gerarFolhaPagamento_FuncionarioValido_FolhaPagamentoSalva() throws Exception {

        Endereco endereco = new Endereco();
        InformacaoMensal informacaoMensal = new InformacaoMensal(5000.0);
        LocalDate dataAniversario = LocalDate.parse("2010-01-01");
        FuncionarioDTO dto = new FuncionarioDTO("NOME", "rg", "cpf", TypeCargo.ANALISTA, "funcao", TypePeriodo.NOTURNO, TypeSexo.FEMININO, dataAniversario, endereco, TypeCategoriaSegurados.CONTRIBUENTE_INDIVIDUAL);
        Funcionario funcionario = new Funcionario(dto);
        funcionario.setInformacaoMensal(informacaoMensal);

        DescontosService descontosService = mock(DescontosService.class);
        when(descontosService.calcularInss(funcionario)).thenReturn(100.0);
        when(descontosService.calcularFgts(funcionario)).thenReturn(200.0);
        when(descontosService.calcularIrrf(funcionario, 100.0)).thenReturn(150.0);
        when(descontosService.calcularSindical(funcionario)).thenReturn(50.0);
        when(descontosService.calcularValeAlimentacao(funcionario)).thenReturn(80.0);
        when(descontosService.calcularValeTransporte(funcionario)).thenReturn(70.0);


        BeneficioService beneficioService = mock(BeneficioService.class);
        when(beneficioService.calcularHoraExtra(funcionario)).thenReturn(50.0);
        when(beneficioService.calcularDSR(funcionario)).thenReturn(30.0);
        when(beneficioService.calcularNoturno(funcionario)).thenReturn(40.0);
        when(beneficioService.calcularInsalubridade(funcionario)).thenReturn(20.0);
        when(beneficioService.calcularPericulosidade(funcionario)).thenReturn(25.0);
        when(beneficioService.calcularSalarioFamilia(funcionario)).thenReturn(60.0);
        when(beneficioService.calcularDiariasViagens(funcionario)).thenReturn(100.0);
        when(beneficioService.calcularAdicional(funcionario)).thenReturn(45.0);
        when(beneficioService.calcularAuxilioCreche(funcionario)).thenReturn(90.0);


        Double inss = descontosService.calcularInss(funcionario);
        Double fgts = descontosService.calcularFgts(funcionario);
        Double irrf = descontosService.calcularIrrf(funcionario, inss);
        Double sindical = descontosService.calcularSindical(funcionario);
        Double valeAlimentacao = descontosService.calcularValeAlimentacao(funcionario);
        Double valeTransport = descontosService.calcularValeTransporte(funcionario);

        assertEquals(100.0, inss, 0.01);
        assertEquals(200.0, fgts, 0.01);
        assertEquals(150.0, irrf, 0.01);
        assertEquals(50.0, sindical, 0.01);
        assertEquals(80.0, valeAlimentacao, 0.01);
        assertEquals(70.0, valeTransport, 0.01);

        // Benefícios
        Double horaExtra = beneficioService.calcularHoraExtra(funcionario);
        Double dsr = beneficioService.calcularDSR(funcionario);
        Double noturno = beneficioService.calcularNoturno(funcionario);
        Double insalubridade = beneficioService.calcularInsalubridade(funcionario);
        Double periculosidade = beneficioService.calcularPericulosidade(funcionario);
        Double salarioFamilia = beneficioService.calcularSalarioFamilia(funcionario);
        Double diariasViagens = beneficioService.calcularDiariasViagens(funcionario);
        Double adicional = beneficioService.calcularAdicional(funcionario);
        Double auxilioCreche = beneficioService.calcularAuxilioCreche(funcionario);

        assertEquals(50.0, horaExtra, 0.01);
        assertEquals(30.0, dsr, 0.01);
        assertEquals(40.0, noturno, 0.01);
        assertEquals(20.0, insalubridade, 0.01);
        assertEquals(25.0, periculosidade, 0.01);
        assertEquals(60.0, salarioFamilia, 0.01);
        assertEquals(100.0, diariasViagens, 0.01);
        assertEquals(45.0, adicional, 0.01);
        assertEquals(90.0, auxilioCreche, 0.01);

    }

}