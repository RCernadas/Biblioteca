package com.biblioteca.basededatos;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

import com.biblioteca.clases.Documento;
import com.biblioteca.clases.Prestamo;
import com.biblioteca.clases.Usuario;
import com.biblioteca.clases.documentos.Libro;
import com.biblioteca.clases.documentos.Revista;
import com.biblioteca.clases.utils.TipoUsuario;

public class Consultas {

	public static void deleteUsuario(String dni) {
		String consulta = "DELETE FROM usuario WHERE dni = ?";
		try (PreparedStatement pstm = Conexion.getConexion().prepareStatement(consulta)) {
			pstm.setString(1, dni);

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertarUsuario(String dni, String nombre, String apellido1, String apellido2,
			TipoUsuario tipoUsuario) {
		String consulta = "INSERT INTO usuario(dni, nombre, apellido_1, apellido_2, tipo_usuario) VALUES (?,?,?,?,?)";
		try (PreparedStatement pstm = Conexion.getConexion().prepareStatement(consulta)) {
			pstm.setString(1, dni);
			pstm.setString(2, nombre);
			pstm.setString(3, apellido1);
			pstm.setString(4, apellido2);
			pstm.setString(5, tipoUsuario.getTipoUsuarioString());

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
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
				if (id != null) {
					documento = new Revista(id, titulo, disponible, numRevista);
					System.out.println(documento.toString());
				}
			}

		} catch (Exception e) {
			System.out.println("NO SE HA PODIDO SELECCIONAR EL DOCUMENTO");
			e.printStackTrace();
		} finally {
			Conexion.closeConexion();
		}
		return documento;

	}
	
	public static Usuario PrestarDocumento(String dni,Documento documento) {
		Usuario usuario = obtenerUsuario(dni);
		Prestamo prestamo = new Prestamo(usuario, documento, LocalDate.now());
		String consulta = "INSERT into prestamo(fecha_devolucion, fecha_prestamo, id_documento, id_usuario) values (?,?,?,?)";

		try (PreparedStatement pstmt = Conexion.getConexion().prepareStatement(consulta);) {
		
			pstmt.setDate(1, Date.valueOf(prestamo.getFechaDevolucion()));
			pstmt.setDate(2, Date.valueOf(prestamo.getFechaSalida()));
			pstmt.setString(3, documento.getIdDocumento());
			pstmt.setInt(4, usuario.getIdUsuario());

			if (documento.isDisponible() && !usuario.superaNumeroMaxDeDocumentosEnPrestamo()) {
				pstmt.executeUpdate();
			} 
		} catch (Exception e) {
			System.out.println("NO SE HA PODIDO PRESTAR EL DOCUMENTO");
			e.printStackTrace();
		}
		return usuario;
	}
	
	public static Usuario DevolverDocumentoActual(Documento documento, String dni) {
		Usuario usuario = obtenerUsuario(dni);
		String consulta = "DELETE FROM prestamo where id_documento = ?";
		
		try(Connection conexion = Conexion.getConexion(); PreparedStatement pstmt = Conexion.getConexion().prepareStatement(consulta);){
			pstmt.setString(1, documento.getIdDocumento());
				pstmt.executeUpdate();
				documento.setDisponible(true);
				usuario.setNumDocumentosEnPrestamo(usuario.getNumDocumentosEnPrestamo()-1);
		} catch (Exception e) {
			System.out.println("NO SE HA PODIDO DEVOLVER EL DOCUMENTO");
			e.printStackTrace();
		}
		
		return usuario;
	}

	public static Usuario obtenerUsuario(String dni) {
		String consulta = "SELECT * FROM usuario WHERE dni LIKE ?";
		Usuario usuario = new Usuario();
		try (PreparedStatement pstm = Conexion.getConexion().prepareStatement(consulta)) {

			pstm.setString(1, dni);

			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				usuario.setIdUsuario(rs.getInt("id"));
				usuario.setDni(rs.getString("dni"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setTipo(TipoUsuario.valueOf((rs.getString("tipo_usuario").toUpperCase())));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}

}
