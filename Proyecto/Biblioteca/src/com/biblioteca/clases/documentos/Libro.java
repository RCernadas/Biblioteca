package com.biblioteca.clases.documentos;

import java.time.LocalDate;

import com.biblioteca.clases.Documento;

public final class Libro extends Documento{
	private LocalDate anhoPublicacion;
	private String autor;

	@Override
	public int calcularTotalEjemplares() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
