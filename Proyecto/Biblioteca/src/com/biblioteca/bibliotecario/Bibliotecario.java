package com.biblioteca.bibliotecario;

import java.util.List;

import com.biblioteca.clases.Documento;
import com.biblioteca.clases.Prestamo;
import com.biblioteca.clases.Usuario;
import com.biblioteca.interfaces.BibliotecarioInterfaz;

public class Bibliotecario implements BibliotecarioInterfaz {

	@Override
	public Documento seleccionarDocumento(String codDocumento) {
		// TODO Auto-generated method stub
		return null;
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

}
