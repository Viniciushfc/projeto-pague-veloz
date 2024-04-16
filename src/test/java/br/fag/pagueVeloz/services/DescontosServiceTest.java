package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.dtos.FuncionarioDTO;
import br.fag.pagueVeloz.entities.*;
import br.fag.pagueVeloz.exceptions.NotFoundException;
import br.fag.pagueVeloz.repositories.DependenteRepository;
import br.fag.pagueVeloz.repositories.FuncionarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class DescontosServiceTest {

    @Mock
    private FuncionarioRepository funcionarioRepository;

    @Mock
    private DependenteRepository dependenteRepository;

    @InjectMocks
    private DescontosService descontosService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCalcularInss() throws NotFoundException {
        Endereco endereco = new Endereco();
        InformacaoMensal informacaoMensal = new InformacaoMensal(2000.0);
        LocalDate dataAniversario = LocalDate.parse("2010-01-01");
        FuncionarioDTO dto = new FuncionarioDTO("NOME", "rg", "cpf", TypeCargo.ANALISTA, "funcao", TypeSexo.FEMININO, dataAniversario, endereco, TypeCategoriaSegurados.CONTRIBUENTE_INDIVIDUAL, informacaoMensal);
        Funcionario funcionario = new Funcionario(dto);
        funcionario.getInformacaoMensal().getSalarioBruto();

        when(funcionarioRepository.findById(1L)).thenReturn(Optional.of(funcionario));

        Double inss = descontosService.calcularInss(funcionario);

        assertEquals(180.0, inss);
    }

    @Test
    public void testCalcularFgts() throws NotFoundException {
        Endereco endereco = new Endereco();
        InformacaoMensal informacaoMensal = new InformacaoMensal(2000.0);
        LocalDate dataAniversario = LocalDate.parse("2010-01-01");
        FuncionarioDTO dto = new FuncionarioDTO("NOME", "rg", "cpf", TypeCargo.ANALISTA, "funcao", TypeSexo.FEMININO, dataAniversario, endereco, TypeCategoriaSegurados.CONTRIBUENTE_INDIVIDUAL, informacaoMensal);
        Funcionario funcionario = new Funcionario(dto);
        funcionario.getInformacaoMensal().getSalarioBruto();

        when(funcionarioRepository.findById(1L)).thenReturn(Optional.of(funcionario));

        Double fgts = descontosService.calcularFgts(funcionario);

        assertEquals(160.0, fgts);
    }

    @Test
    public void testCalcularIrrf() throws NotFoundException {
        Endereco endereco = new Endereco();
        InformacaoMensal informacaoMensal = new InformacaoMensal(2000.00);
        LocalDate dataAniversario = LocalDate.parse("2010-01-01");
        FuncionarioDTO dto = new FuncionarioDTO("NOME", "rg", "cpf", TypeCargo.ANALISTA, "funcao", TypeSexo.FEMININO, dataAniversario, endereco, TypeCategoriaSegurados.CONTRIBUENTE_INDIVIDUAL, informacaoMensal);
        Funcionario funcionario = new Funcionario(dto);
        Dependente dependente = new Dependente();
        List<Dependente> dependente1 = new ArrayList<>();

        dependente1.add(dependente);

        funcionario.setDependentes(dependente1);
        funcionario.getInformacaoMensal().getSalarioBruto();


        when(funcionarioRepository.findById(1L)).thenReturn(Optional.of(funcionario));

        Double inss = descontosService.calcularInss(funcionario);
        Double irrf = descontosService.calcularIrrf(funcionario, inss);

        assertEquals(0.0, irrf);
    }

    @Test
    public void testCalcularSindical() throws NotFoundException {

        Funcionario funcionario = new Funcionario();
        InformacaoMensal informacaoMensal = new InformacaoMensal();
        informacaoMensal.setSindical(true);
        informacaoMensal.setSalarioBruto(2000.0);
        funcionario.setInformacaoMensal(informacaoMensal);

        Double sindical = descontosService.calcularSindical(funcionario);

        // Verificação do resultado esperado
        assertEquals(10.0, sindical);
    }

    @Test
    public void testCalcularValeAlimentacao() throws NotFoundException {
        Funcionario funcionario = new Funcionario();
        InformacaoMensal informacaoMensal = new InformacaoMensal();
        informacaoMensal.setSalarioBruto(3000.0);
        funcionario.setInformacaoMensal(informacaoMensal);
        funcionario.getInformacaoMensal().setValeAlimentacao(200.0);

        Double valeAlimentacao = descontosService.calcularValeAlimentacao(funcionario);

        assertEquals(180.0, valeAlimentacao);
    }

    @Test
    public void testCalcularValeTransporte() throws NotFoundException {
        Funcionario funcionario = new Funcionario();
        InformacaoMensal informacaoMensal = new InformacaoMensal();
        informacaoMensal.setSalarioBruto(3000.0);
        funcionario.setInformacaoMensal(informacaoMensal);


        Double valeTransporte = descontosService.calcularValeTransporte(funcionario);

        assertEquals(300.0, valeTransporte);
    }
}
