package org.generation.metodosJava;

public class MetodosJava {
	
	// --- Método que retorna. Debo declarar el tipo de dato y los argumentos a utilizar.
	public static int sumar(int a, int b) {
		return a + b;
	}
	
	// --- Método que recibe argumentos de diferentes tipos de datos y retorna un valor
	public static String informacion (String nombre, int edad) {
		return nombre + edad;
	}
	
	public static Object infoPersonal (String nombre, double salario) {
		return nombre + " $"  + salario;
	}
	
	// --- Métodos que no retornan, no utilizan la palabra return. Pueden no recibir argumentos
	public static void asteriscos() {
		System.out.println("**********************");
	}
	
	
	// Método main
	public static void main(String[] args) {
		// System.out.println(MetodosJava.sumar(2,2));
		System.out.println(sumar(2, 2));
		System.out.println(informacion("Daniel", 37)); // Tipo de dato es String
		System.out.println(infoPersonal("Daniel", 15233.22)); // Tipo de dato es Object

		asteriscos();
	}
	
}
