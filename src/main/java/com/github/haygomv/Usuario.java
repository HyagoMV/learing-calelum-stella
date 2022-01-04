package com.github.haygomv;

import java.util.Random;

public class Usuario {

	private Long id;
	private Cpf cpf;

	private Usuario(Cpf cpf) {
		this.id = new Random(cpf.hashCode()).nextLong();
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}
	
	public static Usuario registra(Cpf cpf) {
		return new Usuario(cpf);
	}
}
