package org.generation.iterador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iteracion {

	public static void main(String[] args) {
		// 1. Iterar utilizando la interface Iterator<>
		ArrayList<Double> salarios = new ArrayList<>();
		
		salarios.addAll(Arrays.asList(22566.30, 15988.14, 16333.20, 37511.41, 9744.65, 78771.03));
		System.out.println(salarios);
		
		// -- Instanciar un objeto de tipo Iterator se le asigna el ArrayList que va a iterar y un método conocido como iterator();
		Iterator<Double> iterarSalarios = salarios.iterator();
		System.out.println(iterarSalarios);
		
		// -- Necesitamos mostrar cada elemento de la estructura mediante un ciclo (while) y métodos específicos de Iterator para saber si el ciclo continua y para mostrar los elementos iterados
		while (iterarSalarios.hasNext()) {
			double salario = iterarSalarios.next();
			System.out.println(salario);
		}
		
		// 2. Función Lambda y un método .forEach();
		ArrayList<Integer> edades = new ArrayList<>();
		
		edades.addAll(Arrays.asList(26, 28, 22, 26, 23, 22));
		
		// Expresión lambda (parameter) -> execution
		edades.forEach((edad) -> {
			System.out.println(edad);
		});

	}

}
