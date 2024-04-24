package com.biblioteca.interfaces;

import java.util.List;

import com.biblioteca.clases.Documento;
import com.biblioteca.clases.Prestamo;
import com.biblioteca.clases.Usuario;

public interface BibliotecarioInterfaz {
		void seleccionarDocumento(String codDocumento);
		
		void prestarDocumento(Usuario usuario);
		
		void devolverDocumento(Usuario usuario);
		
		List<Prestamo> generarInformePrestamo();
}
