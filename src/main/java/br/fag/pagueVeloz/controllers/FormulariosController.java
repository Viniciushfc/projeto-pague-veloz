package br.fag.pagueVeloz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormulariosController {

    @GetMapping("/formulario")
    public String formulario(){
        return "index";
    }
}
