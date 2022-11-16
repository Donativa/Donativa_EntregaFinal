package com.cadastro.exception;

public class ErroAutentication extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ErroAutentication(String mensagem) {
		super(mensagem);
	}

}
