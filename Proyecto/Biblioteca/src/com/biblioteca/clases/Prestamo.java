package com.biblioteca.clases;

import java.time.LocalDate;

import com.biblioteca.interfaces.PrestamoInterfaz;

public class Prestamo implements PrestamoInterfaz {
	private int idPrestamo;
	private Usuario usuario;
	private Documento documento;
	private LocalDate fechaSalida;
	private LocalDate fechaDevolucion;
	
	@Override
	public LocalDate calcularFechaDevolucion() {
		
		// TODO Auto-generated method stub
		return fechaDevolucion;
	}
	

}
