package br.fag.pagueVeloz.restapi.services;

import br.fag.pagueVeloz.restapi.dtos.DependenteDTO;
import br.fag.pagueVeloz.restapi.dtos.FuncionarioDTO;
import br.fag.pagueVeloz.restapi.entities.*;
import br.fag.pagueVeloz.restapi.infra.repositories.DependenteRepository;
import br.fag.pagueVeloz.restapi.infra.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ScriptDbService {

    @Autowired
    private FuncionarioService funcionarioService;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private DependenteRepository dependenteRepository;

    public void cadastrarFuncionarioSCRIPT() {

        FuncionarioDTO funcionarioDTO1 = new FuncionarioDTO("Insalubridade Grau 1", "1", "1", TypeCargo.ANALISTA, "Analista", TypePeriodo.NOTURNO, TypeSexo.FEMININO, LocalDate.of(2000, 10, 10), new Endereco(), TypeCategoriaSegurados.TRABALHADOR_AVULSO);

        Funcionario funcionario1 = new Funcionario(funcionarioDTO1);
        funcionario1.setAtivo(true);
        funcionarioRepository.save(funcionario1);

        FuncionarioDTO funcionarioDTO2 = new FuncionarioDTO("Insalubridade Grau 2", "2", "2", TypeCargo.ANALISTA, "Analista", TypePeriodo.NOTURNO, TypeSexo.FEMININO, LocalDate.of(2000, 10, 10), new Endereco(), TypeCategoriaSegurados.TRABALHADOR_AVULSO);
        Funcionario funcionario2 = new Funcionario(funcionarioDTO2);
        funcionario2.setAtivo(true);
        funcionarioRepository.save(funcionario2);

        FuncionarioDTO funcionarioDTO3 = new FuncionarioDTO("Insalubridade Grau 3", "3", "3", TypeCargo.ANALISTA, "Analista", TypePeriodo.NOTURNO, TypeSexo.FEMININO, LocalDate.of(2000, 10, 10), new Endereco(), TypeCategoriaSegurados.TRABALHADOR_AVULSO);
        Funcionario funcionario3 = new Funcionario(funcionarioDTO3);
        funcionario3.setAtivo(true);
        funcionarioRepository.save(funcionario3);

        FuncionarioDTO funcionarioDTO4 = new FuncionarioDTO("Periculosidade", "4", "4", TypeCargo.ANALISTA, "Analista", TypePeriodo.NOTURNO, TypeSexo.FEMININO, LocalDate.of(2000, 10, 10), new Endereco(), TypeCategoriaSegurados.TRABALHADOR_AVULSO);
        Funcionario funcionario4 = new Funcionario(funcionarioDTO4);
        funcionario4.setAtivo(true);
        funcionarioRepository.save(funcionario4);

        FuncionarioDTO funcionarioDTO5 = new FuncionarioDTO("Funcionario padrao", "5", "5", TypeCargo.ANALISTA, "Analista", TypePeriodo.NOTURNO, TypeSexo.FEMININO, LocalDate.of(2000, 10, 10), new Endereco(), TypeCategoriaSegurados.TRABALHADOR_AVULSO);
        Funcionario funcionario5 = new Funcionario(funcionarioDTO5);
        funcionario5.setAtivo(true);
        funcionarioRepository.save(funcionario5);

        FuncionarioDTO funcionarioDTO6 = new FuncionarioDTO("Funcionario que Viaja", "6", "6", TypeCargo.ANALISTA, "Analista", TypePeriodo.NOTURNO, TypeSexo.FEMININO, LocalDate.of(2000, 10, 10), new Endereco(), TypeCategoriaSegurados.TRABALHADOR_AVULSO);
        Funcionario funcionario6 = new Funcionario(funcionarioDTO6);
        funcionario6.setAtivo(true);
        funcionarioRepository.save(funcionario6);

        FuncionarioDTO funcionarioDTO7 = new FuncionarioDTO("Funcionario Salario Familia", "7", "7", TypeCargo.ANALISTA, "Analista", TypePeriodo.NOTURNO, TypeSexo.FEMININO, LocalDate.of(2000, 10, 10), new Endereco(), TypeCategoriaSegurados.TRABALHADOR_AVULSO);
        Funcionario funcionario7 = new Funcionario(funcionarioDTO7);
        DependenteDTO dependenteDTO = new DependenteDTO("7","Funcionarinho Salario Familia","77","filho", LocalDate.of(2015, 10, 10));
        Dependente dependente = new Dependente(dependenteDTO);
        dependenteRepository.save(dependente);
        List<Dependente> dependentes = new ArrayList<>();
        dependentes.add(dependente);
        funcionario7.setDependentes(dependentes);
        funcionario7.setAtivo(true);
        funcionarioRepository.save(funcionario7);

        FuncionarioDTO funcionarioDTO8 = new FuncionarioDTO("Funcionario Auxilio creche", "8", "8", TypeCargo.ANALISTA, "Analista", TypePeriodo.NOTURNO, TypeSexo.FEMININO, LocalDate.of(2000, 10, 10), new Endereco(), TypeCategoriaSegurados.TRABALHADOR_AVULSO);
        Funcionario funcionario8 = new Funcionario(funcionarioDTO8);
        DependenteDTO dependenteDTO1 = new DependenteDTO("7","Funcionarinho Auxilio creche","88","filho", LocalDate.of(2024, 3, 10));
        Dependente dependente1 = new Dependente(dependenteDTO1);
        dependenteRepository.save(dependente1);
        List<Dependente> dependentes1 = new ArrayList<>();
        dependentes1.add(dependente1);
        funcionario7.setDependentes(dependentes1);
        funcionario8.setAtivo(true);
        funcionarioRepository.save(funcionario8);

        FuncionarioDTO funcionarioDTO9 = new FuncionarioDTO("Caso sindical", "9", "9", TypeCargo.ANALISTA, "Analista", TypePeriodo.NOTURNO, TypeSexo.FEMININO, LocalDate.of(2000, 10, 10), new Endereco(), TypeCategoriaSegurados.TRABALHADOR_AVULSO);
        Funcionario funcionario9 = new Funcionario(funcionarioDTO9);
        funcionario9.setAtivo(true);
        funcionarioRepository.save(funcionario9);

        int count = 0;
        Random random = new Random();

        while (count < 21) {
            String nome = "Funcionário " + (count + 1);
            String rg = String.valueOf(random.nextInt(1000000));
            String cpf = String.valueOf(random.nextInt(1000000000));
            TypeCargo typeCargo = TypeCargo.values()[random.nextInt(TypeCargo.values().length)];
            String funcao = "Função " + (count + 1);
            TypePeriodo typePeriodo = TypePeriodo.values()[random.nextInt(TypePeriodo.values().length)];
            TypeSexo typeSexo = TypeSexo.values()[random.nextInt(TypeSexo.values().length)];
            LocalDate dataAniversario = LocalDate.of(random.nextInt(50) + 1970, random.nextInt(12) + 1, random.nextInt(28) + 1);
            Endereco endereco = new Endereco();
            TypeCategoriaSegurados typeCategoriaSegurados = TypeCategoriaSegurados.values()[random.nextInt(TypeCategoriaSegurados.values().length)];

            FuncionarioDTO funcionarioDTO = new FuncionarioDTO(nome, rg, cpf, typeCargo, funcao, typePeriodo, typeSexo, dataAniversario, endereco, typeCategoriaSegurados);

            Funcionario funcionario = new Funcionario(funcionarioDTO);
            funcionario.setAtivo(true);
            funcionarioRepository.save(funcionario);

            count++;
        }



    }
}
