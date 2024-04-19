package br.fag.pagueVeloz.restapi.controllers;

import br.fag.pagueVeloz.restapi.entities.FolhaPagamento;
import br.fag.pagueVeloz.restapi.services.FolhaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FolhaPagamentoController {

    @Autowired
    private FolhaPagamentoService folhaPagamentoService;

    @GetMapping("/folha/{id}")
    public ResponseEntity<Object> gerarFolhaPagamento(@PathVariable Long id) throws Exception {
        FolhaPagamento folhaPagamento = this.folhaPagamentoService.gerarFolhaPagamento(id);
        return new ResponseEntity<>(folhaPagamento, HttpStatus.OK);
    }
}
