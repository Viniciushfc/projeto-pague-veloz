package br.fag.pagueVeloz.exceptions;

public class NotFoundException extends Exception{
    public NotFoundException() {
        super("Usuario não encontrado!");
    }
}
