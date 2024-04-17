package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.entities.Funcionario;
import br.fag.pagueVeloz.entities.Dependente;
import br.fag.pagueVeloz.entities.InformacaoMensal;
import br.fag.pagueVeloz.entities.TypeInsalubridade;
import br.fag.pagueVeloz.entities.TypePeriodo;
import br.fag.pagueVeloz.exceptions.NotFoundException;
import br.fag.pagueVeloz.repositories.FuncionarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BeneficioServiceTest {

    @Mock
    private FuncionarioRepository funcionarioRepository;

    @InjectMocks
    private BeneficioService beneficioService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalcularHoraExtra() throws NotFoundException {
        Funcionario funcionario = new Funcionario();
        InformacaoMensal informacaoMensal = new InformacaoMensal();
        informacaoMensal.setSalarioBruto(2000.0);
        informacaoMensal.setJornadaDeTrabalho(192.0);
        informacaoMensal.setHorasExtras(5.0);
        funcionario.setInformacaoMensal(informacaoMensal);
        funcionario.setTypePeriodo(TypePeriodo.NOTURNO);

        Double horaExtra = beneficioService.calcularHoraExtra(funcionario);

        assertEquals(104.16, horaExtra, 0.01);
    }

    @Test
    public void testCalcularDSR() throws NotFoundException {
        Funcionario funcionario = new Funcionario();
        InformacaoMensal informacaoMensal = new InformacaoMensal();
        informacaoMensal.setSalarioBruto(2000.0);
        informacaoMensal.setJornadaDeTrabalho(192.0);
        funcionario.setInformacaoMensal(informacaoMensal);

        Double dsr = beneficioService.calcularDSR(funcionario);

        assertEquals(333.33, dsr, 0.01);
    }

    @Test
    public void testCalcularNoturno() throws NotFoundException {
        Funcionario funcionario = new Funcionario();
        InformacaoMensal informacaoMensal = new InformacaoMensal();
        informacaoMensal.setSalarioBruto(2000.0);
        informacaoMensal.setJornadaDeTrabalho(192.0);
        funcionario.setInformacaoMensal(informacaoMensal);
        funcionario.setTypePeriodo(TypePeriodo.NOTURNO);

        Double noturno = beneficioService.calcularNoturno(funcionario);

        assertEquals(12.5, noturno, 0.01);
    }

    @Test
    public void testCalcularInsalubridade() throws NotFoundException {
        Funcionario funcionario = new Funcionario();
        InformacaoMensal informacaoMensal = new InformacaoMensal();
        informacaoMensal.setGrauInsalubridade(TypeInsalubridade.GRAU1);
        informacaoMensal.setPericulosidade(false);
        funcionario.setInformacaoMensal(informacaoMensal);

        Double insalubridade = beneficioService.calcularInsalubridade(funcionario);

        assertEquals(130.0, insalubridade);
    }

    @Test
    public void testCalcularPericulosidade() throws NotFoundException {
        Funcionario funcionario = new Funcionario();
        InformacaoMensal informacaoMensal = new InformacaoMensal();
        informacaoMensal.setGrauInsalubridade(TypeInsalubridade.GRAU0);
        informacaoMensal.setPericulosidade(true);
        informacaoMensal.setSalarioBruto(2000.0);
        funcionario.setInformacaoMensal(informacaoMensal);

        Double periculosidade = beneficioService.calcularPericulosidade(funcionario);

        assertEquals(2600.0, periculosidade);
    }

    @Test
    public void testCalcularSalarioFamilia() throws NotFoundException {
        Funcionario funcionario = new Funcionario();
        Dependente dependente1 = new Dependente();
        dependente1.setDataNascimento(LocalDate.now().minusDays(1000)); // Menos de 14 anos
        Dependente dependente2 = new Dependente();
        dependente2.setDataNascimento(LocalDate.now().minusDays(4000)); // Mais de 14 anos
        funcionario.setDependentes(Arrays.asList(dependente1, dependente2));

        Double salarioFamilia = beneficioService.calcularSalarioFamilia(funcionario);

        assertEquals(130.0, salarioFamilia);
    }

    @Test
    public void testCalcularDiariasViagens() throws NotFoundException {
        Funcionario funcionario = new Funcionario();
        InformacaoMensal informacaoMensal = new InformacaoMensal();
        informacaoMensal.setSalarioBruto(2000.0);
        informacaoMensal.setViagem(true);
        funcionario.setInformacaoMensal(informacaoMensal);

        Double diariasViagens = beneficioService.calcularDiariasViagens(funcionario);

        assertEquals(1000.0, diariasViagens);
    }

    @Test
    public void testCalcularAdicional() throws NotFoundException {
        Funcionario funcionario = new Funcionario();
        funcionario.setRegistrado(LocalDate.now().minusDays(2880)); // 8 anos atrás

        Double adicional = beneficioService.calcularAdicional(funcionario);

        assertEquals(1500.0, adicional);
    }

    @Test
    public void testCalcularAuxilioCreche() throws NotFoundException {
        Funcionario funcionario = new Funcionario();
        Dependente dependente1 = new Dependente();
        dependente1.setDataNascimento(LocalDate.now().minusDays(90)); // Menos de 6 meses
        Dependente dependente2 = new Dependente();
        dependente2.setDataNascimento(LocalDate.now().minusDays(4000)); // Mais de 14 anos
        funcionario.setDependentes(Arrays.asList(dependente1, dependente2));

        Double auxilioCreche = beneficioService.calcularAuxilioCreche(funcionario);

        assertEquals(400.0, auxilioCreche);
    }
}
