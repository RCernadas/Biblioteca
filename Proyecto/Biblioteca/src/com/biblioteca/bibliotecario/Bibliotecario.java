package com.biblioteca.bibliotecario;

import java.util.List;

import com.biblioteca.basededatos.Consultas;
import com.biblioteca.clases.Documento;
import com.biblioteca.clases.Prestamo;
import com.biblioteca.clases.Usuario;
import com.biblioteca.interfaces.BibliotecarioInterfaz;

public class Bibliotecario implements BibliotecarioInterfaz {
	private Documento documentoActual;

	@Override
	public void seleccionarDocumento(String codDocumento) {
		documentoActual = Consultas.selecccionarDocumento(codDocumento);
	}

	@Override
	public void prestarDocumento(Documento documento, Usuario usuario) {
		// TODO Auto-generated method stub
	}

	@Override
	public void devolverDocumento(Documento documento, Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Prestamo> generarInformePrestamo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Documento getDocumentoActual() {
		return documentoActual;
	}

}
