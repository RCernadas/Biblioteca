package com.biblioteca.clases.documentos;

import java.time.LocalDate;

import com.biblioteca.clases.Documento;

public final class Libro extends Documento {
	private LocalDate anhoPublicacion;
	private String autor;

	public Libro(int idDocumento, String titulo, boolean isDisponible, int totalEjemplares, LocalDate anhoPublicacion,
			String autor) {
		super(idDocumento, titulo, isDisponible, totalEjemplares);
		this.anhoPublicacion = anhoPublicacion;
		this.autor = autor;
	}

	@Override
	public int calcularTotalEjemplares() {
		// TODO Auto-generated method stub
		return 0;
	}

	public LocalDate getAnhoPublicacion() {
		return anhoPublicacion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAnhoPublicacion(LocalDate anhoPublicacion) {
		this.anhoPublicacion = anhoPublicacion;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
