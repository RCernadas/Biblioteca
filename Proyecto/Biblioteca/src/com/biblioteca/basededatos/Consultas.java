package com.biblioteca.basededatos;

public class Consultas {

	public void select() {
		try {
			Conexion.getConexion();
			//AQUI VA EL CODIGO
		} catch (Exception e) {

		} finally {
			Conexion.closeConexion();
		}
	}
	
}
