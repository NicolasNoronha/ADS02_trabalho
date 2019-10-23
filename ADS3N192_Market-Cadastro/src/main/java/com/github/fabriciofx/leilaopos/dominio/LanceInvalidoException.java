package com.github.fabriciofx.leilaopos.dominio;

public class LanceInvalidoException extends Exception {
	private static final long serialVersionUID = -1047895755210552908L;
	
	public LanceInvalidoException() {
		super("lance inválido");
	}
}
