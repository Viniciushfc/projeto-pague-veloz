package br.fag.pagueVeloz.controllers;

import br.fag.pagueVeloz.dtos.AdicionarDependenteDTO;
import br.fag.pagueVeloz.dtos.DependenteDTO;
import br.fag.pagueVeloz.entities.dependente.Dependente;
import br.fag.pagueVeloz.entities.funcionario.Funcionario;
import br.fag.pagueVeloz.services.DependenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dependente")
public class DependenteController {
    @Autowired
    private DependenteService dependenteService;

    @PostMapping("/created")
    public ResponseEntity<Object> cadastrarFuncionario(@RequestBody DependenteDTO dto){
        Dependente dependente = this.dependenteService.cadastrarDependente(dto);
        return new ResponseEntity<>(dependente, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> exibirFuncionario(@PathVariable Long id) throws Exception {
        Dependente dependente = this.dependenteService.exibirDependente(id);
        return new ResponseEntity<>(dependente, HttpStatus.OK);
    }

    @GetMapping
    public List<Dependente> exibirFuncionarios(){
        return this.dependenteService.exibirDependentes();
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Object> editarFuncionario(@PathVariable Long id, DependenteDTO dto) throws Exception {
        Dependente dependente = this.dependenteService.editarDependente(id, dto);
        return new ResponseEntity<>(dependente, HttpStatus.OK);
    }

    @PutMapping("/add/{id}")
    public ResponseEntity<Object> editarFuncionario(@PathVariable Long id, AdicionarDependenteDTO dto) throws Exception {
        Funcionario funcionario = this.dependenteService.adicionarDependente(dto);
        return new ResponseEntity<>(funcionario, HttpStatus.OK);
    }

    @PutMapping("/disable/{id}")
    public ResponseEntity<Object> desativarFuncionario(@PathVariable Long id) throws Exception {
        this.dependenteService.desativarDependente(id);
        return new ResponseEntity("Foi desativo com sucesso!", HttpStatus.OK);
    }
}
