package org.generation.loops;

import java.util.Scanner;

public class Loops {
	public static void main (String[] args) {
		
		// 1. Crear un programa que realice una cuenta de 1 a n, donde n es el número que el usuario proporciona
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un número final");
		
			// Podemos inicializar varias variables del mismo tipo en una sola línea
		int numInicial, numFinal;
		numInicial = 1;
		numFinal = scanner.nextInt();
		
		while ( numInicial <= numFinal ) {
			System.out.println(numInicial);
			numInicial++;
		}
		
		// 2. Determinar que el cliente número 5 de un total de 20 clientes es el ganador
		for (int cliente = 1; cliente <= 20; cliente++) {
			// Evaluar el cliente ganador
			if (cliente == 5) {
			    System.out.println("Eres el cliente número 5, ¡Ganaste!");
			    continue; // o un break? 
			}
			System.out.println("Cliente número " + cliente);
		}

		// 3. Crear un programa que nos permita calcular el área de un círculo (a = pi*r^2), solicitando al usuario el valor del radio de la circunferencia
		System.out.println("Ingresa el radio de la circunferencia para conocer el área de un círculo");
		float radio = scanner.nextFloat();
		
			// Operación del área
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El área del círculo es de " + area);
		
		// 4. Crear un programa que solicite al usuario un número entre 1 y 999 para determinar cuántos dígitos tiene dicho número. El programa se ejecuta sin ciclicamente hasta que el usuario escribe 0
		int numero;
		
		do {
			System.out.println("\tIngresa un número entre 1 y 999 para conocer cuántos dígitos tiene. \n\tAl ingresar 0 el programa termina.");
			numero = scanner.nextInt();
			
			if (numero >= 100 && numero <= 999) {
				System.out.println("El número " + numero + " posee 3 dígitos");
			} else if (numero >= 10 && numero <=99) {
				System.out.println("El número " + numero + " posee 2 dígitos");
			} else if (numero >= 0 && numero <= 9) {
				System.out.println("El número " + numero + " posee 1 dígito");
			} else {
				System.out.println("Tu número no entra en el rango");
			} 
		} while ( numero != 0 );
		
		
		
		
		
		
		
		scanner.close();
	}
}
