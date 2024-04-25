package com.biblioteca.clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.biblioteca.clases.documentos.Libro;
import com.biblioteca.clases.utils.TipoUsuario;
import com.biblioteca.interfaces.PrestamoInterfaz;

public class Prestamo implements PrestamoInterfaz {
	private static final int SOCIO_DIAS_PRESTAMO = 30;
	private static final int NO_SOCIO_DIAS_PRESTAMO = 15;

	private int idPrestamo;
	private Usuario usuario;
	private Documento documento;
	private LocalDate fechaSalida;
	private LocalDate fechaDevolucion;

	public Prestamo(Usuario usuario, Documento documento, LocalDate fechaSalida) {
		super();
		this.usuario = usuario;
		this.documento = documento;
		this.fechaSalida = fechaSalida;
		this.fechaDevolucion = calcularFechaDevolucion();
	}

	@Override
	public LocalDate calcularFechaDevolucion() {
		LocalDate fecha;
		if (usuario.getTipo().equals(TipoUsuario.SOCIO)) {
			if (documento instanceof Libro) {
				fecha = fechaSalida.plusDays(SOCIO_DIAS_PRESTAMO);
			} else {
				fecha = fechaSalida.plusDays(SOCIO_DIAS_PRESTAMO / 3);
			}
		} else {
			if (documento instanceof Libro) {
				fecha = fechaSalida.plusDays(NO_SOCIO_DIAS_PRESTAMO);
			} else {
				fecha = fechaSalida.plusDays(NO_SOCIO_DIAS_PRESTAMO / 3);
			}
		}
		return fecha;
	}
	
	public int calcularDiasPrestamo() {
		int ret;
		ret = (int) ChronoUnit.DAYS.between(fechaSalida, fechaDevolucion);
		return ret;
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(documento.getTitulo() + "\t");
		if (documento instanceof Libro) {
			builder.append("(" + ((Libro) documento).getAnhoPublicacion().getYear() + ")" + "\t");
		}
		builder.append("Cod: " + documento.getIdDocumento());
		builder.append("Plazo: " + calcularDiasPrestamo() + "\n\t");
		builder.append("prestado a: " + usuario.getDni() + "(" + usuario.getTipo().getTipoUsuarioString() + ")");
		return builder.toString();
	}

}
