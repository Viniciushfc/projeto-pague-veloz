package br.fag.pagueVeloz.restapi.services;

import br.fag.pagueVeloz.restapi.dtos.FuncionarioDTO;
import br.fag.pagueVeloz.restapi.dtos.InformacaoMensalDTO;
import br.fag.pagueVeloz.restapi.entities.Funcionario;
import br.fag.pagueVeloz.restapi.entities.InformacaoMensal;
import br.fag.pagueVeloz.restapi.infra.exceptions.NotFoundException;
import br.fag.pagueVeloz.restapi.infra.repositories.FuncionarioRepository;
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

        Funcionario funcionario = optionalFuncionario.get();

        return funcionario;
    }

    //Função para listar todos os Funcionarios.
    public List<Funcionario> exibirFuncionarios() {
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
        funcionario.setTypeCargo(dto.typeCargo());
        funcionario.setFuncao(dto.funcao());
        funcionario.setTypeSexo(dto.typeSexo());
        funcionario.setTypePeriodo(dto.typePeriodo());
        funcionario.setDataAniversario(dto.dataAniversario());
        funcionario.setEndereco(dto.endereco());
        funcionario.setTypeCategoriaSegurados(dto.typeCategoriaSegurados());

        salvarFuncionario(funcionario);

        return funcionario;
    }

    //Função para Desativar um Funcionario.
    public void desativarFuncionario(Long id) throws Exception {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();

        funcionario.setAtivo(false);
    }

    public void ativarFuncionario(Long id) throws NotFoundException {
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();
        if (funcionario.getAtivo() == false) {
            funcionario.setAtivo(true);
        }

    }

    public Funcionario addInfoFuncionario(long id, InformacaoMensalDTO dto) throws NotFoundException{
        Optional<Funcionario> optionalFuncionario = Optional.ofNullable(this.funcionarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException()));

        Funcionario funcionario = optionalFuncionario.get();

        InformacaoMensal informacaoMensal = new InformacaoMensal(dto);

        funcionario.setInformacaoMensal(informacaoMensal);

        salvarFuncionario(funcionario);

        return funcionario;
    }
}
