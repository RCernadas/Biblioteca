package com.biblioteca.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Connection conexion = null;
	private static final String URL = "";
	private static final String USUARIO = "";
	private static final String CONTRASENHA = "";
	
	//OBTENER LA INSTANCIA DE LA CONEXION
	public static Connection getConexion() {
		if (conexion == null) {
			try {
				Class.forName("com.mysql.cj.Driver");
				conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENHA);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conexion;
	}
	//CERRAR LA INSTANCIA DE LA CONEXION
	public static void closeConexion() {
		if (conexion != null) {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
