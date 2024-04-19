package br.fag.pagueVeloz.restapi.infra.exceptions;

public class NotFoundException extends Exception{
    public NotFoundException() {
        super("Usuario não encontrado!");
    }
}
