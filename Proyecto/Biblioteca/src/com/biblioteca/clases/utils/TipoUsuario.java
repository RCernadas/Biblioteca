package com.biblioteca.clases.utils;

public enum TipoUsuario {
	SOCIO ("Socio"),
	USUARIO_OCASIONAL ("Usuario Ocasional");

	private String tipoUsuarioString;
	private TipoUsuario(String string) {
		this.tipoUsuarioString = string;
	}
	public String getTipoUsuarioString() {
		return tipoUsuarioString;
	}
	
}
