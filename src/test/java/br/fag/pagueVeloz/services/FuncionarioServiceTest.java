package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.dtos.FuncionarioDTO;
import br.fag.pagueVeloz.entities.*;
import br.fag.pagueVeloz.exceptions.NotFoundException;
import br.fag.pagueVeloz.repositories.FuncionarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FuncionarioServiceTest {

    @Mock
    private FuncionarioRepository funcionarioRepository;

    @InjectMocks
    private FuncionarioService funcionarioService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSalvarFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionarioService.salvarFuncionario(funcionario);
        verify(funcionarioRepository, times(1)).save(funcionario);
    }

    @Test
    public void testCadastrarFuncionario() {
        Endereco endereco = new Endereco();
        InformacaoMensal informacaoMensal = new InformacaoMensal();
        LocalDate dataAniversario = LocalDate.parse("2010-01-01");
        FuncionarioDTO dto = new FuncionarioDTO("NOME", "rg", "cpf", TypeCargo.ANALISTA, "funcao", TypeSexo.FEMININO, dataAniversario, endereco, TypeCategoriaSegurados.CONTRIBUENTE_INDIVIDUAL, informacaoMensal);
        Funcionario funcionario = new Funcionario(dto);
        when(funcionarioRepository.save(funcionario)).thenReturn(funcionario);
        Funcionario savedFuncionario = funcionarioService.cadastrarFuncionario(dto);
        assertNotNull(savedFuncionario);
        assertTrue(savedFuncionario.getAtivo());
    }

    @Test
    public void testExibirFuncionario() throws Exception {
        Funcionario funcionario = new Funcionario();
        when(funcionarioRepository.findById(1L)).thenReturn(Optional.of(funcionario));
        Funcionario foundFuncionario = funcionarioService.exibirFuncionario(1L);
        assertNotNull(foundFuncionario);
    }

    @Test
    public void testExibirFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        when(funcionarioRepository.findAll()).thenReturn(funcionarios);
        List<Funcionario> foundFuncionarios = funcionarioService.exibirFuncionarios();
        assertEquals(funcionarios, foundFuncionarios);
    }

    @Test
    public void testEditarFuncionario() throws Exception {
        Endereco endereco = new Endereco();
        InformacaoMensal informacaoMensal = new InformacaoMensal();
        LocalDate dataAniversario = LocalDate.parse("2010-01-01");
        FuncionarioDTO dto = new FuncionarioDTO("NOME", "rg", "cpf", TypeCargo.ANALISTA, "funcao", TypeSexo.FEMININO, dataAniversario, endereco, TypeCategoriaSegurados.CONTRIBUENTE_INDIVIDUAL, informacaoMensal);
        Funcionario funcionario = new Funcionario();
        when(funcionarioRepository.findById(1L)).thenReturn(Optional.of(funcionario));
        when(funcionarioRepository.save(funcionario)).thenReturn(funcionario);
        Funcionario updatedFuncionario = funcionarioService.editarFuncionario(1L, dto);
        assertNotNull(updatedFuncionario);
    }

    @Test
    public void testDesativarFuncionario() throws Exception {
        Funcionario funcionario = new Funcionario();
        when(funcionarioRepository.findById(1L)).thenReturn(Optional.of(funcionario));
        funcionarioService.desativarFuncionario(1L);
        assertFalse(funcionario.getAtivo());
    }
}
