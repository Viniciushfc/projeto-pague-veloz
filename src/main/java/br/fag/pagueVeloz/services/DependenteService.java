package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.dtos.AdicionarDependenteDTO;
import br.fag.pagueVeloz.dtos.DependenteDTO;
import br.fag.pagueVeloz.entities.dependente.Dependente;
import br.fag.pagueVeloz.entities.funcionario.Funcionario;
import br.fag.pagueVeloz.exceptions.NotFoundException;
import br.fag.pagueVeloz.repositories.DependenteRepository;
import br.fag.pagueVeloz.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<Dependente> exibirDependentes(){
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
        dependente.setIdade(dto.idade());

        salvarDependente(dependente);

        return dependente;
    }


    public Funcionario adicionarDependente(AdicionarDependenteDTO dto) throws NotFoundException {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(funcionarioRepository.findByCpf(dto.cpfResponsavel()).orElseThrow(() -> new NotFoundException()));
        Optional<Dependente> optionalDependente = Optional.ofNullable(dependenteRepository.findByCpf(dto.cpfDependente()).orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();

        funcionario.setDependentes(optionalDependente.get());

        this.funcionarioRepository.save(funcionario);

        return funcionario;
    }

    //Função para Desativar um Dependente.
    public void desativarDependente(Long id) throws Exception{
        Optional<Dependente> optionalDependente = Optional.ofNullable(this.dependenteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Dependente dependente = optionalDependente.get();

//        dependente.setAtivo(false);
    }
}
