package org.generation.calculadora;

public class CalculadoraMain {

	public static void main(String[] args) {
		// Aquí viven las instancias de los objetos de la clase Calculadora
		Calculadora calculadora01 = new Calculadora();
		Calculadora calculadora02 = new Calculadora();
		
		System.out.println(calculadora01.sumar(10, 20));
		System.out.println(calculadora02.restar(10, 20));
		
	}

}
