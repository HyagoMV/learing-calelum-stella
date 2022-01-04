package com.github.haygomv;

import java.util.Objects;

public class Cpf {

	private String value;
	private Validador validador;

	public Cpf(String value, Validador validador) {
		this.validador = validador;
		setValue(value);
	}

	public String getValue() {
		return value;
	}

	private void setValue(String value) {
		if (!validador.validar(value))
			throw new CpfInvalidException();
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cpf other = (Cpf) obj;
		return Objects.equals(value, other.value);
	}

}
