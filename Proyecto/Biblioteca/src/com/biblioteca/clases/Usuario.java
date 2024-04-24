package com.biblioteca.clases;

import com.biblioteca.clases.utils.TipoUsuario;

public final class Usuario {
	private int idUsuario;
	private String dni;
	private String nombre;
	private TipoUsuario tipo;
	
	public Usuario() {	
	}
	
	public Usuario(int idUsuario, String dni, String nombre, TipoUsuario tipo) {
		super();
		this.idUsuario = idUsuario;
		this.dni = dni;
		this.nombre = nombre;
		this.tipo = tipo;
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

}
