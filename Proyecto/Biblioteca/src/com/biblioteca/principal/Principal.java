package com.biblioteca.principal;

import com.biblioteca.basededatos.Conexion;
import com.biblioteca.basededatos.Consultas;

public class Principal {
	public static void main(String[] args) {
		Conexion.getConexion();
		System.out.println("hola");
		Consultas.selecccionarDocumento("la");
	}
}
