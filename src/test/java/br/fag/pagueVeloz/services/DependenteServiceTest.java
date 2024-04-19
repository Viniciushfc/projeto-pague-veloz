package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.restapi.dtos.AdicionarDependenteDTO;
import br.fag.pagueVeloz.restapi.dtos.DependenteDTO;
import br.fag.pagueVeloz.restapi.entities.Dependente;
import br.fag.pagueVeloz.restapi.entities.Funcionario;
import br.fag.pagueVeloz.restapi.infra.exceptions.CustomException;
import br.fag.pagueVeloz.restapi.infra.exceptions.NotFoundException;
import br.fag.pagueVeloz.restapi.infra.repositories.DependenteRepository;
import br.fag.pagueVeloz.restapi.infra.repositories.FuncionarioRepository;
import br.fag.pagueVeloz.restapi.services.DependenteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DependenteServiceTest {

    @Mock
    private DependenteRepository dependenteRepository;

    @Mock
    private FuncionarioRepository funcionarioRepository;

    @InjectMocks
    private DependenteService dependenteService;

    @Test
    public void testCadastrarDependente() {
        DependenteDTO dependenteDTO = new DependenteDTO(
                "cpfResponsavel",
                "nomeDependente",
                "12345678900",
                "grauDeParentesco",
                LocalDate.of(2000, 1, 1) // Exemplo de data de nascimento
        );

        Dependente dependente = dependenteService.cadastrarDependente(dependenteDTO);


        assertEquals(true, dependente.getAtivo());
        verify(dependenteRepository, times(1)).save(any(Dependente.class));
    }

    @Test
    public void testExibirDependente() throws Exception {
        Dependente dependente = new Dependente();

        when(dependenteRepository.findById(1L)).thenReturn(Optional.of(dependente));
        Dependente foundDependente = dependenteService.exibirDependente(1L);

        assertNotNull(foundDependente);

    }

    @Test
    public void testExibirDependentes() {
        List<Dependente> dependentes = new ArrayList<>();

        when(dependenteRepository.findAll()).thenReturn(dependentes);

        List<Dependente> resultFound = dependenteService.exibirDependentes();

        assertEquals(dependentes, resultFound);
    }

    @Test
    public void testEditarDependente() throws Exception {
        DependenteDTO dependenteDTO = new DependenteDTO(
                "cpfResponsavel",
                "nomeDependente",
                "12345678900",
                "grauDeParentesco",
                LocalDate.of(2000, 1, 1) // Exemplo de data de nascimento
        );

        Dependente dependente = new Dependente();
        dependente.setId(1L);

        when(dependenteRepository.findById(1L)).thenReturn(Optional.of(dependente));
        when(dependenteRepository.save(dependente)).thenReturn(dependente);

        Dependente dependenteUpdate = dependenteService.editarDependente(1L, dependenteDTO);

        assertNotNull(dependenteUpdate);
    }

    @Test
    public void testAdicionarDependente() throws NotFoundException, CustomException {
        AdicionarDependenteDTO dto = new AdicionarDependenteDTO("12345678901");
        long idDependente = 1L;

        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("12345678901");

        Dependente dependente = new Dependente();
        dependente.setId(idDependente);


        when(funcionarioRepository.findByCpf(dto.cpfResponsavel())).thenReturn(Optional.of(funcionario));
        when(dependenteRepository.findById(idDependente)).thenReturn(Optional.of(dependente));
        when(funcionarioRepository.save(funcionario)).thenReturn(funcionario);

        Funcionario result = dependenteService.adicionarDependente(idDependente, dto);

        assertEquals(funcionario, result);
        assertEquals(1, funcionario.getDependentes().size());
        assertEquals(dependente, funcionario.getDependentes().get(0));
        verify(funcionarioRepository, times(1)).findByCpf(dto.cpfResponsavel());
        verify(dependenteRepository, times(1)).findById(idDependente);
        verify(funcionarioRepository, times(1)).save(funcionario);
    }

    @Test
    public void testDesativarDependente() throws Exception {
        Dependente dependente = new Dependente();

        when(dependenteRepository.findById(1L)).thenReturn(Optional.of(dependente));
        dependenteService.desativarDependente(1L);
        assertFalse(dependente.getAtivo());
    }

    @Test
    public void testAtivarDependente() throws Exception {
        Dependente dependente = new Dependente();

        when(dependenteRepository.findById(1L)).thenReturn(Optional.of(dependente));
        dependenteService.ativarDependente(1L);
        assertTrue(dependente.getAtivo());
    }
}