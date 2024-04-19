package br.fag.pagueVeloz.restapi.controllers;

import br.fag.pagueVeloz.restapi.dtos.AdicionarDependenteDTO;
import br.fag.pagueVeloz.restapi.dtos.DependenteDTO;
import br.fag.pagueVeloz.restapi.entities.Dependente;
import br.fag.pagueVeloz.restapi.entities.Funcionario;
import br.fag.pagueVeloz.restapi.services.DependenteService;
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
    public ResponseEntity<Object> cadastrarDependente(@RequestBody DependenteDTO dto){
        Dependente dependente = this.dependenteService.cadastrarDependente(dto);
        return new ResponseEntity<>(dependente, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> exibirDependente(@PathVariable Long id) throws Exception {
        Dependente dependente = this.dependenteService.exibirDependente(id);
        return new ResponseEntity<>(dependente, HttpStatus.OK);
    }

    @GetMapping
    public List<Dependente> exibirDependentes(){
        return this.dependenteService.exibirDependentes();
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Object> editarDependente(@PathVariable Long id, @RequestBody DependenteDTO dto) throws Exception {
        Dependente dependente = this.dependenteService.editarDependente(id, dto);
        return new ResponseEntity<>(dependente, HttpStatus.OK);
    }

    @PutMapping("/add/{id}")
    public ResponseEntity<Object> adicionarDependente(@PathVariable Long id, @RequestBody AdicionarDependenteDTO dto) throws Exception {
        Funcionario funcionario = this.dependenteService.adicionarDependente(id,dto);
        return new ResponseEntity<>(funcionario, HttpStatus.OK);
    }

    @PutMapping("/disable/{id}")
    public ResponseEntity<Object> desativarDependente(@PathVariable Long id) throws Exception {
        this.dependenteService.desativarDependente(id);
        return new ResponseEntity("Foi desativo com sucesso!", HttpStatus.OK);
    }


    @PutMapping("/active/{id}")
    public ResponseEntity<Object> ativarDependente(@PathVariable Long id) throws Exception {
        this.dependenteService.ativarDependente(id);
        return new ResponseEntity("Foi ativo com sucesso!", HttpStatus.OK);
    }
}
