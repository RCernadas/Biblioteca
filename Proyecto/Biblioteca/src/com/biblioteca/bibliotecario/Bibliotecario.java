package com.biblioteca.bibliotecario;

import java.util.List;

import com.biblioteca.basededatos.Consultas;
import com.biblioteca.clases.Documento;
import com.biblioteca.clases.Prestamo;
import com.biblioteca.clases.Usuario;
import com.biblioteca.clases.utils.TipoUsuario;
import com.biblioteca.interfaces.BibliotecarioInterfaz;

public class Bibliotecario implements BibliotecarioInterfaz {
	private Documento documentoActual;

	@Override
	public void seleccionarDocumento(String codDocumento) {
		documentoActual = Consultas.selecccionarDocumento(codDocumento);
		System.out.println("Documento actual -> " + getDocumentoActual());
	}

	@Override
	public void prestarDocumento(Usuario usuario) {
		
	}

	@Override
	public void devolverDocumento(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Prestamo> generarInformePrestamo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void insertUsuario() {
		Consultas.insertarUsuario("111111Y", "PedroPedro", "PedroPedro", "PedroPedro", TipoUsuario.SOCIO);
	}
	public void deleteUsuario() {
		Consultas.deleteUsuario("111111Y");
	}
	
	public Documento getDocumentoActual() {
		return documentoActual;
	}

}
