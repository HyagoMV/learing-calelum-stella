package com.github.haygomv;

public class CpfInvalidException extends RuntimeException {

	public CpfInvalidException() {
		super("CPF é inválido!");
	}

	private static final long serialVersionUID = 1L;

}
