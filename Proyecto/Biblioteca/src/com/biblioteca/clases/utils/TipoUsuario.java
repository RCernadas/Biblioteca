package com.biblioteca.clases.utils;

public enum TipoUsuario {
	SOCIO ("Socio"),
	USUARIO_OCASIONAL ("Usuario Ocasional");

	private String tipoUsuarioString;
	TipoUsuario(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getTipoUsuarioString() {
		return tipoUsuarioString;
	}
	
}
