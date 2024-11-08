package org.generation.letras;

import java.util.Scanner;

public class Letras {
	
	// Instanciar un objeto de tipo Scanner para recibir el texto del usuario
	Scanner scanner = new Scanner(System.in);
	
	// Método para darle contexto al usuario, recibe un parámetro String para mensajes personalizados
	public void contexto(String mensaje) {
		System.out.println(mensaje);
	}
	
	// Método para retornar el Scanner y utilizarlo las veces que queramos en diferentes instancias
	public String leerTexto() {
		return scanner.nextLine();
	}
	
}
