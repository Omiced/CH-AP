package org.generation.metodosJava;

import java.util.Scanner;

public class ClassString {
	public static void main(String[] args) {
		// Creando String
		String mensaje = "Hoy es jueves y mañana es puente";
		String festividad = new String("Mañana se celebra día de muertos");
		String puenteFestivo = "Mañana se celebra día de muertos";
		String prueba = "";
		
		System.out.println(mensaje + " y " + festividad);
		
		// Métodos de String
		// --- length();
		System.out.println("La longitud de mi String es de " + mensaje.length() + " caracteres"); //Output: 32
		// --- charAt(index);
		System.out.println("Devolvemos el caracter al que apunta el índice proporcionado, aquí es el caracter " + festividad.charAt(2) + " que se encuentra en el índice 2"); // Output: ñ
			//System.out.println("Probando métodos: " + prueba.charAt(0)); // Output: Exception
		// --- equals(String2); Hay que tener la tabla ASCII, mayúsculas y minúsculas no son lo mismo.
		System.out.println("Comparandos dos String y el resultado es " + festividad.equals(puenteFestivo)); // Output: true
		// --- toUpperCase(); y toLowerCase();
		System.out.println("Convirtiendo String en mayúscula -> " + puenteFestivo.toUpperCase());
		System.out.println("Convirtiendo String en minúscula -> " + puenteFestivo.toLowerCase());
		// --- replace(oldChar, newChar);
		System.out.println("Si queremos reemplazar un caracter de un String con otro usamos replace, por ejemplo: " + mensaje.replace('e', '3'));
		
		System.out.println(prueba);

		// --- Ejemplo. Solicitar al usuario un texto (String) y le vamos a mostrar cada uno de los caracteres en forma de lista. 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un texto");
		
		String texto = scanner.nextLine();
		scanner.close();
		
		System.out.println("\tSolución 1");
		
		// Solución 1. Iterar sobre el String y transformarlo en caracteres 
		for (int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
		
		System.out.println("\tSolución 2");
		
		// Solución 2. Aplicar un ciclo for-Each al String convertido en un Array de caracteres
		for (char caracter : texto.toCharArray()) {
			System.out.println(caracter);
		}
		
		System.out.println("\tSolución 3");
		
		// Solución 3. Utilizando `var`, permite inferir automáticamente el tipo de dato de la variable.
		for (var caracter : texto.toCharArray()) {
			System.out.println(caracter);
		}
		
		
		
	}
}
