package org.generation.hashSetCollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetCollection {
	public static void main(String[] args) {
		// ---- HashSet ----
		// Los HashSet son respaldados por las tablas hash donde los elementos se recuperar mediante la optimización de la memoria. Por lo tanto, los elementos se muestran desordenados. No se muestran los elementos duplicados
		HashSet<String> animales = new HashSet<>(); 
		
		// -- Agregando elementos, se muestran desordenados y sin repeticiones
		animales.addAll(Arrays.asList("capibara", "conejo", "león", "pingüino", "ornitorrinco", "capibara", "wallabi", "carcayú", "cacatúa", "capibara"));
		System.out.println(animales);
		
		/*
		for (var animal : animales) {
			System.out.println(animal);
		}
		*/
		
		// -- Conocer si un elemento se encuentra dentro de la estructura de datos .contains(value);
		System.out.println(animales.contains("perro")); // Output: false
		System.out.println(animales.contains("capibara")); // Output: true
		
		// -- Limpiar estructura de datos .clear()
		animales.clear();
		System.out.println(animales); // Output: []
		
		// --- El TreeSet se encuentra ordenado de menor a mayor y no permite duplicados
		TreeSet<Integer> ejemploSet = new TreeSet<>();
		ejemploSet.addAll(Arrays.asList(12, 136, 144, 98, 12));
		
		System.out.println(ejemploSet);
		
		
		TreeSet<Integer> numeros = new TreeSet<>(); // Usa el orden natural (ascendente)
		TreeSet<String> palabras = new TreeSet<>(Comparator.reverseOrder()); // Orden inverso, ya que se implemente la interface Comparator y el método reverseOrder()
		
	}
}
