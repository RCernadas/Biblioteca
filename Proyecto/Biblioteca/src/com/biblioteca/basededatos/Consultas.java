package com.biblioteca.basededatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

import com.biblioteca.clases.Documento;
import com.biblioteca.clases.documentos.Libro;
import com.biblioteca.clases.documentos.Revista;

public class Consultas {

	public void select() {
		try {
			Conexion.getConexion();
			// AQUI VA EL CODIGO
		} catch (Exception e) {

		} finally {
			Conexion.closeConexion();
		}
	}

	public static Documento selecccionarDocumento(String idDoc) {
		Documento documento = null;
		String consultaLibro = "SELECT id, titulo, disponible, autor, anho_publicacion FROM documento as d join libro as li on(d.id = li.id_documento) where d.id = '"
				+ idDoc + "'";
		String consultaRevista = "SELECT id, titulo, disponible, num_revista FROM documento as d join revista as r on(d.id = r.id_documento) where d.id = '"
				+ idDoc + "'";
		try {
			PreparedStatement pstmt1 = Conexion.getConexion().prepareStatement(consultaLibro);
			PreparedStatement pstmt2 = Conexion.getConexion().prepareStatement(consultaRevista);
			
			ResultSet rs1 = pstmt1.executeQuery();

			while (rs1.next()) {
				String id = rs1.getString("id");
				String titulo = rs1.getString("titulo");
				Boolean disponible = rs1.getBoolean("disponible");
				String autor = rs1.getString("autor");
				LocalDate anhoPublicacion = rs1.getDate("anho_publicacion").toLocalDate();
				if (autor != null) {
					documento = new Libro(id, titulo, disponible, anhoPublicacion, autor);
					System.out.println(documento.toString());
				}
			}

			ResultSet rs2 = pstmt2.executeQuery();

			while (rs2.next()) {
				String id = rs1.getString("id");
				String titulo = rs1.getString("titulo");
				Boolean disponible = rs1.getBoolean("disponible");
				int numRevista = rs1.getInt("num_revista");
				if(id != null) {
					documento = new Revista(id, titulo, disponible, numRevista);
					System.out.println(documento.toString());
				}
			}

		} catch (Exception e) {

		} finally {
			Conexion.closeConexion();
		}
		return documento;

	}

}
