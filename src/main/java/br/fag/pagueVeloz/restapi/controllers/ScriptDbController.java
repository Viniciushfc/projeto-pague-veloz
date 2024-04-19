package br.fag.pagueVeloz.restapi.controllers;

import br.fag.pagueVeloz.restapi.entities.Funcionario;
import br.fag.pagueVeloz.restapi.services.ScriptDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/script")
public class ScriptDbController {

    @Autowired
    private ScriptDbService scriptDbService;

    @PostMapping()
    public void cadastrarFuncionario(){
        this.scriptDbService.cadastrarFuncionarioSCRIPT();
    }
}
