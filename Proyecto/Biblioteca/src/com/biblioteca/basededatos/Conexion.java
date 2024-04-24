package com.biblioteca.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Connection conexion = null;
	private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
	private static final String USUARIO = "root";
	private static final String CONTRASENHA = "abc123.";
	
	//OBTENER LA INSTANCIA DE LA CONEXION
	public static Connection getConexion() {
		if (conexion == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
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
