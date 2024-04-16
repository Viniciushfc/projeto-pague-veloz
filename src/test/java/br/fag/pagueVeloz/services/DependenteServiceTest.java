package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.dtos.AdicionarDependenteDTO;
import br.fag.pagueVeloz.dtos.DependenteDTO;
import br.fag.pagueVeloz.dtos.FuncionarioDTO;
import br.fag.pagueVeloz.entities.*;
import br.fag.pagueVeloz.exceptions.CustomException;
import br.fag.pagueVeloz.exceptions.NotFoundException;
import br.fag.pagueVeloz.repositories.DependenteRepository;
import br.fag.pagueVeloz.repositories.FuncionarioRepository;
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

        assertEquals("nomeDependente", dependente.getNomeDependente());
        assertEquals("12345678900", dependente.getCpf());
        assertEquals(true, dependente.getAtivo());
        verify(dependenteRepository, times(1)).save(any(Dependente.class));
    }

    @Test
    public void testExibirDependente() {
        Dependente dependenteMock = new Dependente();
        dependenteMock.setId(1L);

        when(dependenteRepository.findById(1L)).thenReturn(Optional.of(dependenteMock));

        Dependente dependente = null;
        try {
            dependente = dependenteService.exibirDependente(1L);
        } catch (Exception e) {
            fail("Erro ao exibir dependente: " + e.getMessage());
        }

        assertNotNull(dependente);
        assertEquals(1L, dependente.getId());
    }

    @Test
    public void testExibirDependentes() {
        List<Dependente> dependenteList = new ArrayList<>();
        dependenteList.add(new Dependente());
        dependenteList.add(new Dependente());

        when(dependenteRepository.findAll()).thenReturn(dependenteList);

        List<Dependente> result = dependenteService.exibirDependentes();

        assertEquals(2, result.size());
    }

    @Test
    public void testEditarDependente() {

        DependenteDTO dependenteDTO = new DependenteDTO(
                "cpfResponsavel",
                "nomeDependente",
                "12345678900",
                "grauDeParentesco",
                LocalDate.of(2000, 1, 1) // Exemplo de data de nascimento
        );

        Dependente dependenteMock = new Dependente();
        dependenteMock.setId(1L);

        when(dependenteRepository.findById(1L)).thenReturn(Optional.of(dependenteMock));

        Dependente dependente = null;
        try {
            dependente = dependenteService.editarDependente(1L, dependenteDTO);
        } catch (Exception e) {
            fail("Erro ao editar dependente: " + e.getMessage());
        }

        assertNotNull(dependente);
        assertEquals("nomeDependente", dependente.getNomeDependente());
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
    public void testDesativarDependente() {
        Dependente dependenteMock = new Dependente();
        dependenteMock.setId(1L);

        when(dependenteRepository.findById(1L)).thenReturn(Optional.of(dependenteMock));

        assertDoesNotThrow(() -> dependenteService.desativarDependente(1L));
    }
}
