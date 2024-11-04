package org.generation.controlDeFlujo;

import java.util.Scanner;

public class ControlDeFlujo {
	public static void main(String[] args) {
		
		System.out.println("Ingresa tu edad");
		
		Scanner scanner = new Scanner(System.in);
		int edad = scanner.nextInt();
		
		// if-else
		if (edad < 18) {
			System.out.println("Eres menor de edad");
		} else {
			System.out.println("Eres mayor de edad");
		}
		
		// Switch
		System.out.println("Ingresa un número del 1 al 7 y te mostramos el día de la semana que corresponde");
		byte numeroDia = scanner.nextByte();
		
		switch(numeroDia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			default:
				System.out.println("Número incorrecto");
				break;
		}
		
		// Operador ternario
		// -- Ejemplo. Si el precio de un producto es mayor a $2000 se le realiza un 10% de descuento, si no, se le realiza un 5% de descuento. Cuál sería el descuento en pesos del producto? 
		int precio = 1599;
		double descuento = (precio > 2000) ? precio * 0.1 : precio * 0.05;
		System.out.println("El descuento del producto es de $" + descuento);
		
		// -- Ejemplo. Conocer si un usuario está activo y mostrar en consola un mensaje
		boolean activo = true;
		String mensaje = activo ? "El usuario está activo" : "Usuario inactivo";
		System.out.println(mensaje);
		
		scanner.close();
		
	}
}
