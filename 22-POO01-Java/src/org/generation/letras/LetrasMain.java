package org.generation.letras;

public class LetrasMain {

	public static void main(String[] args) {
		// Probando que nuestros métodos de Letras funcionen
		/*
		Letras usuario1 = new Letras();
		usuario1.contexto("Ingresa un texto");
		usuario1.leerTexto();
		
		Letras usuario2 = new Letras();
		usuario2.contexto("Escribe lo que quieras");
		usuario2.leerTexto();
		*/
		
		// 1. Instanciar los objetos de las clases
		Letras letras = new Letras();
		Contador contador = new Contador();
		
		// 2. Aplicar los métodos necesarios a cada instancia
		letras.contexto("Ingresa un texto y te mostraremos una cuenta de los caracteres");
		String texto = letras.leerTexto(); // Guardamos el Scanner en una variable llamada texto
		
		// 3. Aplicar los métodos para contabilizar los caracteres
		int totalVocales = contador.contarVocales(texto);
		System.out.println("Tienes " + totalVocales + " vocales");
		
		int totalConsonantes = contador.contarConsonantes(texto);
		System.out.println("Tienes " + totalConsonantes + " consonantes");
		
		int totalNumeros = contador.contarNumeros(texto);
		System.out.println("Tienes " + totalNumeros + " números");
		
		int totalSimbolos = contador.contarSimbolos(texto);
		System.out.println("Tienes " + totalSimbolos + " símbolos");

		
		
		

	}

}
