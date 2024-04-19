package br.fag.pagueVeloz.restapi.services;

import br.fag.pagueVeloz.restapi.dtos.AdicionarDependenteDTO;
import br.fag.pagueVeloz.restapi.dtos.DependenteDTO;
import br.fag.pagueVeloz.restapi.entities.Dependente;
import br.fag.pagueVeloz.restapi.entities.Funcionario;
import br.fag.pagueVeloz.restapi.infra.exceptions.CustomException;
import br.fag.pagueVeloz.restapi.infra.exceptions.NotFoundException;
import br.fag.pagueVeloz.restapi.infra.repositories.DependenteRepository;
import br.fag.pagueVeloz.restapi.infra.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DependenteService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private DependenteRepository dependenteRepository;

    //Função para Salvar um Dependente no DB.
    public void salvarDependente(Dependente dependente) {
        this.dependenteRepository.save(dependente);
    }

    //Função para Cadastrar um Dependente.
    public Dependente cadastrarDependente(DependenteDTO dto) {
        Dependente newDependente = new Dependente(dto);
        newDependente.setAtivo(true);
        salvarDependente(newDependente);
        return newDependente;
    }

    //Função para encontrar um Dependente especifico por ID.
    public Dependente exibirDependente(Long id) throws Exception {
        Optional<Dependente> optionalDependente = Optional.ofNullable(this.dependenteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        return optionalDependente.get();
    }

    //Função para listar todos os Dependente.
    public List<Dependente> exibirDependentes() {
        return this.dependenteRepository.findAll();
    }

    //Função para Editar um Dependente.
    public Dependente editarDependente(Long id, DependenteDTO dto) throws Exception {
        Optional<Dependente> optionalDependente = Optional.ofNullable(this.dependenteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Dependente dependente = optionalDependente.get();

        dependente.setCpfResponsavel(dto.cpfResponsavel());
        dependente.setNomeDependente(dto.nomeDependente());
        dependente.setCpf(dto.cpf());
        dependente.setDataNascimento(dto.dataNascimento());

        salvarDependente(dependente);

        return dependente;
    }


    public Funcionario adicionarDependente(long idDependente, AdicionarDependenteDTO dto) throws NotFoundException, CustomException {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(funcionarioRepository.findByCpf(dto.cpfResponsavel()).orElseThrow(() -> new NotFoundException()));
        Optional<Dependente> optionalDependente = Optional.ofNullable(dependenteRepository.findById(idDependente).orElseThrow(() -> new CustomException("caiu no depente")));

        Funcionario funcionario = optionalFuncionario.get();
        Dependente dependente = optionalDependente.get();

        if (funcionario.getDependentes() == null) {
            funcionario.setDependentes(new ArrayList<>());
        }

        funcionario.getDependentes().add(dependente);
        funcionarioRepository.save(funcionario);

        return funcionario;
    }

    //Função para Desativar um Dependente.
    public void desativarDependente(Long id) throws Exception {
        Optional<Dependente> optionalDependente = Optional.ofNullable(this.dependenteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Dependente dependente = optionalDependente.get();

        dependente.setAtivo(false);
    }

    public void ativarDependente(Long id) throws NotFoundException {
        Optional<Dependente> optionalDependente = Optional.ofNullable(this.dependenteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Dependente dependente = optionalDependente.get();

        if (dependente.getAtivo() == false) {
            dependente.setAtivo(true);
        }

    }
}
