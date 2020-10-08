package br.com.dh.jwt.exceptions;

public class SenhaInvalidaException extends RuntimeException {
	public SenhaInvalidaException() {
        super("Senha inválida");
    }
}
