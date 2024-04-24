package com.biblioteca.principal;

import java.util.Scanner;

import com.biblioteca.basededatos.Conexion;
import com.biblioteca.basededatos.Consultas;
import com.biblioteca.bibliotecario.Bibliotecario;

public class Principal {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Bibliotecario bibliotecario = new Bibliotecario();
		String codDocumento;
		System.out.println("Introduce el codigo de documento que quieres selccionar");
		codDocumento = leerString();
		bibliotecario.seleccionarDocumento(leerString());
		System.out.println("Has seleccionado este documento ->");
		System.out.println(bibliotecario.getDocumentoActual());
		
		
	}
	
	private static String leerString() {
		String ret = "";
		try {
			ret = scan.nextLine();
		}catch (Exception e) {
			leerString();
		}
		return ret;
	}
}
