package com.biblioteca.clases.documentos;

import com.biblioteca.clases.Documento;

public final class Revista extends Documento {
	private int numeroRevista;

	public Revista(String idDocumento, String titulo, boolean isDisponible, int numeroRevista) {
		super(idDocumento, titulo, isDisponible);
		this.numeroRevista = numeroRevista;
	}

	@Override
	public int calcularTotalEjemplares() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getNumeroRevista() {
		return numeroRevista;
	}

	public void setNumeroRevista(int numeroRevista) {
		this.numeroRevista = numeroRevista;
	}
}
