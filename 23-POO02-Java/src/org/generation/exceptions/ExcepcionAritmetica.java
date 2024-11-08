package org.generation.exceptions;

// Vamos a crear un método que me permita dividir 2 enteros. En esta misma clase creo método y los mando a llamar
public class ExcepcionAritmetica {
	// Método para dividir dos enteros
	static int division(int num1, int num2) {
		return num1 / num2;
	}
	
	static float divisionDecimales(float num1, float num2) {
		return num1 / num2;
	}
	
	
	public static void main(String[] args) {
		// Mandar a llamar el método
		System.out.println(division(50, 10)); // Output: 5
		System.out.println(division(50, 7)); // Output: 7
		System.out.println(divisionDecimales(50, 5)); // Output: 10.0
		System.out.println(division(0, 5)); // Output: 0
		// System.out.println(division(5, 0)); // Output: Exception 
		
		// -- Manejando Exceptions (try-catch)
		// Forzar la Exception
		try {
			int resultado = division(20, 0);
			System.out.println("El resultado de la division es " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("\u001B[31mNo se puede dividir entre cero\u001B[32m");
		} finally {
			System.out.println("Programa finalizado\u001B[0m");
		}
		
		// Al manejar excepciones no se detiene el flujo del programa
		try {
			int resultado = division(40, 20);
			System.out.println("El resultado de la division es " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir entre cero");
		}
		
	}
}
