package com.biblioteca.clases;

import java.time.LocalDate;

import com.biblioteca.interfaces.PrestamoInterfaz;

public class Prestamo implements PrestamoInterfaz {
	private int idPrestamo;
	private Usuario usuario;
	private Documento documento;
	private LocalDate fechaSalida;
	private LocalDate fechaDevolucion;

	public Prestamo(int idPrestamo, Usuario usuario, Documento documento, LocalDate fechaSalida,
			LocalDate fechaDevolucion) {
		super();
		this.idPrestamo = idPrestamo;
		this.usuario = usuario;
		this.documento = documento;
		this.fechaSalida = fechaSalida;
		this.fechaDevolucion = fechaDevolucion;
	}

	@Override
	public LocalDate calcularFechaDevolucion() {

		// TODO Auto-generated method stub
		return fechaDevolucion;
	}

	public int getIdPrestamo() {
		return idPrestamo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Documento getDocumento() {
		return documento;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

}
