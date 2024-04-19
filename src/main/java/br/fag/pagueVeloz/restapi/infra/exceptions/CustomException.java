package br.fag.pagueVeloz.restapi.infra.exceptions;

public class CustomException extends Exception{
    public CustomException(String mensagem) {
        super(mensagem);
    }
}
