package br.fag.pagueVeloz.services;

import br.fag.pagueVeloz.dtos.FuncionarioDTO;
import br.fag.pagueVeloz.entities.funcionario.Funcionario;
import br.fag.pagueVeloz.exceptions.NotFoundException;
import br.fag.pagueVeloz.repositories.DependenteRepository;
import br.fag.pagueVeloz.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;


    //Função para Salvar um Funcionario no DB.
    public void salvarFuncionario(Funcionario funcionario) {
        this.funcionarioRepository.save(funcionario);
    }

    //Função para Cadastrar um Funcionario.
    public Funcionario cadastrarFuncionario(FuncionarioDTO dto) {
        Funcionario newFuncionario = new Funcionario(dto);
        newFuncionario.setAtivo(true);
        salvarFuncionario(newFuncionario);
        return newFuncionario;
    }

    //Função para encontrar um Funcionario especifico por ID.
    public Funcionario exibirFuncionario(Long id) throws Exception {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        return optionalFuncionario.get();
    }

    //Função para listar todos os Funcionarios.
    public List<Funcionario> exibirFuncionarios(){
        return this.funcionarioRepository.findAll();
    }

    //Função para Editar um Funcionario.
    public Funcionario editarFuncionario(Long id, FuncionarioDTO dto) throws Exception {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();

        funcionario.setNome(dto.nome());
        funcionario.setRg(dto.rg());
        funcionario.setCpf(dto.cpf());
        funcionario.setTypeSexo(dto.typeSexo());
        funcionario.setDataAniversario(dto.dataAniversario());
        funcionario.setEndereco(dto.endereco());
        funcionario.setTypeCategoriaSegurados(dto.typeCategoriaSegurados());
        funcionario.setInformacaoPagamento(dto.informacaoPagamento());

        salvarFuncionario(funcionario);

        return funcionario;
    }

    //Função para Desativar um Funcionario.
    public void desativarFuncionario(Long id) throws Exception{
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();

        funcionario.setAtivo(false);
    }
}
