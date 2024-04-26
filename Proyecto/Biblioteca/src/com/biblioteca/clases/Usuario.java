package com.biblioteca.clases;

import java.util.List;

import com.biblioteca.clases.utils.TipoUsuario;

public final class Usuario {
	private static final int SOCIO_NUM_DOCUMENTOS_EN_PRESTAMO = 20;
	private static final int NO_SOCIO_DOCUMENTOS_EN_PRESTAMO = 2;

	private int idUsuario;
	private String dni;
	private String nombre;
	private TipoUsuario tipo;
	private int numDocumentosEnPrestamo;

	public Usuario() {
	}

	public Usuario(int idUsuario, String dni, String nombre, TipoUsuario tipo) {
		super();
		this.idUsuario = idUsuario;
		this.dni = dni;
		this.nombre = nombre;
		this.tipo = tipo;
		numDocumentosEnPrestamo = 0;
	}

	public boolean superaNumeroMaxDeDocumentosEnPrestamo() {
		boolean ret = false;
		if (getTipo().equals(TipoUsuario.SOCIO)) {
			if (getNumDocumentosEnPrestamo() >= 20) {
				ret = true;
			}
		}
		if (getTipo().equals(TipoUsuario.USUARIO_OCASIONAL)) {
			if (getNumDocumentosEnPrestamo() >= 2) {
				ret = true;
			}
		}
		return ret;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

<<<<<<< HEAD
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [idUsuario=");
		builder.append(idUsuario);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", tipo=");
		builder.append(tipo.getTipoUsuarioString());
		builder.append("]");
		return builder.toString();
	}
	
	
=======
	public int getNumDocumentosEnPrestamo() {
		return numDocumentosEnPrestamo;
	}

	public void setNumDocumentosEnPrestamo(int numDocumentosEnPrestamo) {
		this.numDocumentosEnPrestamo = numDocumentosEnPrestamo;
	}
>>>>>>> main
}
