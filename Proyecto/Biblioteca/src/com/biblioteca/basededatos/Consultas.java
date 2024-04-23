package com.biblioteca.basededatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.biblioteca.clases.Documento;
import com.biblioteca.clases.documentos.Libro;

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
	
	public static Documento selecccionarDocumento(String codigo) {
		boolean isDisponible = false;
		String consulta = "SELECT id, titulo, disponible, id_documento, autor FROM documento as d join libro as li on(d.id = li.id_documento) where d.titulo LIKE '%"+ codigo +"%'";
		try {
			PreparedStatement stmt = Conexion.getConexion().prepareStatement(consulta);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String titulo = rs.getString("titulo");
				System.out.println(titulo);
			}
			
		} catch (Exception e) {
			
		} finally {
			Conexion.closeConexion();
		}
		Documento documento = null;
		return documento;

	}
	
}
