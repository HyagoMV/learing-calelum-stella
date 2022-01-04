package com.github.haygomv;

public class Main {

	public static void main(String[] args) {
		Usuario u0 = Usuario.registra(new Cpf("92687251003", new StellaValidador()));
		Usuario u1 = Usuario.registra(new Cpf("92687251003", new StellaValidador()));
		
		System.out.println(u0.getId().equals(u1.getId()));
	}

}
