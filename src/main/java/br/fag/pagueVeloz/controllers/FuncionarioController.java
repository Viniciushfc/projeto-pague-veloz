package br.fag.pagueVeloz.controllers;

import br.fag.pagueVeloz.dtos.FuncionarioDTO;
import br.fag.pagueVeloz.entities.funcionario.Funcionario;
import br.fag.pagueVeloz.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping("/created")
    public ResponseEntity<Object> cadastrarFuncionario(@RequestBody FuncionarioDTO dto){
        Funcionario funcionario = this.funcionarioService.cadastrarFuncionario(dto);
        return new ResponseEntity<>(funcionario, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> exibirFuncionario(@PathVariable Long id) throws Exception {
        Funcionario funcionario = this.funcionarioService.exibirFuncionario(id);
        return new ResponseEntity<>(funcionario, HttpStatus.OK);
    }

    @GetMapping
    public List<Funcionario> exibirFuncionarios(){
        return this.funcionarioService.exibirFuncionarios();
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Object> editarFuncionario(@PathVariable Long id, FuncionarioDTO dto) throws Exception {
        Funcionario funcionario = this.funcionarioService.editarFuncionario(id, dto);
        return new ResponseEntity<>(funcionario, HttpStatus.OK);
    }

    @PutMapping("/disable/{id}")
    public ResponseEntity<Object> desativarFuncionario(@PathVariable Long id) throws Exception {
        this.funcionarioService.desativarFuncionario(id);
        return new ResponseEntity("Foi desativo com sucesso!", HttpStatus.OK);
    }
}
