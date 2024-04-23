package com.biblioteca.clases;

import com.biblioteca.interfaces.DocumentoInterfaz;

public abstract class Documento implements DocumentoInterfaz {
	private int idDocumento;
	private String titulo;
	private boolean isDisponible;
	private int totalEjemplares;
	
	
	
	public Documento(int idDocumento, String titulo, boolean isDisponible, int totalEjemplares) {
		super();
		this.idDocumento = idDocumento;
		this.titulo = titulo;
		this.isDisponible = isDisponible;
		this.totalEjemplares = totalEjemplares;
	}

	@Override
	public abstract int calcularTotalEjemplares() ;
	
	
	public int getIdDocumento() {
		return idDocumento;
	}

	public String getTitulo() {
		return titulo;
	}

	public boolean isDisponible() {
		return isDisponible;
	}

	public int getTotalEjemplares() {
		return totalEjemplares;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDisponible(boolean isDisponible) {
		this.isDisponible = isDisponible;
	}

	public void setTotalEjemplares(int totalEjemplares) {
		this.totalEjemplares = totalEjemplares;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documento [idDocumento=");
		builder.append(idDocumento);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", isDisponible=");
		builder.append(isDisponible);
		builder.append(", totalEjemplares=");
		builder.append(totalEjemplares);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}
