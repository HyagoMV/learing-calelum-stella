package com.github.haygomv;

import br.com.caelum.stella.validation.CPFValidator;

public class StellaValidador implements Validador {

	@Override
	public boolean validar(String value) {
		CPFValidator validator = new CPFValidator();
		try {
			validator.assertValid(value);
			return true;
		} catch (Exception e) {
			return false;	
		}
	}

}
