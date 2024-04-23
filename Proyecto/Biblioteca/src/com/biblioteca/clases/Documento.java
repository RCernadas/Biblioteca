package com.biblioteca.clases;

import com.biblioteca.interfaces.DocumentoInterfaz;

public abstract class Documento implements DocumentoInterfaz {
	private int idDocumento;
	private String titulo;
	private boolean isDisponible;
	private int totalEjemplares;
	
	@Override
	public abstract int calcularTotalEjemplares() ;
	
	
	
}
