package com.biblioteca.principal;

import java.util.List;
import java.util.Scanner;

import com.biblioteca.bibliotecario.Bibliotecario;
import com.biblioteca.clases.Prestamo;
import com.biblioteca.clases.Usuario;

public class Principal {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Bibliotecario bibliotecario = new Bibliotecario();
		String codDocumento;
		
		Usuario usuario = null;
		
		int opcion;
		opcion = accionesUsuarios();
		do {
			switch (opcion) {
			case 1 -> {
				System.out.println("Introduce el codigo de documento que quieres selccionar");
				codDocumento = leerString();
				bibliotecario.seleccionarDocumento(codDocumento);
			}
			case 2 -> {
				bibliotecario.prestarDocumento(usuario);
			}
			case 3 -> {
				bibliotecario.devolverDocumento(usuario);
			}	
			case 4 -> {
				List<Prestamo> listaPrestamos;
				listaPrestamos = bibliotecario.generarInformePrestamo();
			}
			case 5 -> {
				bibliotecario.deleteUsuario();

			}
			}
			opcion = accionesUsuarios();
		} while (opcion > 0 || opcion < 6);

	}

	private static int accionesUsuarios() {
		int ret;
		System.out.println("Menu:\n" + "1.Seleccionar un documento\n" + "2.Prestar Libro\n" + "3.Mostrar Libros prestados\n"
				+ "4.Mostrar Libros completos\n" + "5.Salir\n");
		System.out.println("Escoger opcion ");
		ret = leerOpcion();
		return ret;
	}

	private static String leerString() {
		String ret = "";
		try {
			ret = scan.nextLine();
		} catch (Exception e) {
			leerString();
		}
		return ret;
	}

	private static int leerOpcion() {
		int ret = -1;
		try {
			ret = Integer.parseInt(scan.nextLine());
		} catch (Exception e) {
			leerString();
		}
		return ret;
	}
}
