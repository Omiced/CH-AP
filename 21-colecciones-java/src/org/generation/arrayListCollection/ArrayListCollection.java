package org.generation.arrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {
		// --- ArrayList ---
		// Podemos inicializar el ArrayList a partir de su clase para que dicha estructura de dato no cambie su tipo, o bien, si inicializamos desde la interface podemos mutarla a las diferentes estructuras que implementan dicha interface.
		// Array redimensionable (que puede cambiar de tamaño) y permite elementos duplicados
		ArrayList<String> peliculas = new ArrayList<String>(); // Creando ArrayList desde la propia clase
		List<Integer> edades = new ArrayList<Integer>(); // Creando ArrayList desde la interface List
		ArrayList<Double> salarios = new ArrayList<>();
		
		// Agregar elementos al ArrayList (.add())
		peliculas.add("Interestelar");
		peliculas.add("Matrix");
		peliculas.add("batman");
		peliculas.add("Señor de los anillos");
		peliculas.add("Terrifier");
		peliculas.add("The Silence of The Lambs");
		peliculas.add("No manches Frida 2");
		peliculas.add("El Stand de los Besos 3");
		peliculas.add("Nacho libre");
		peliculas.add("Cementerio de mascotas");
		System.out.println(peliculas);
		
		// Acceder a elementos específicos del ArrayList .get(index);
		String pelicula03 = peliculas.get(2);
		System.out.println(pelicula03); //Output: Batman
		
		// Modificar elemento del ArrayList .set(index, newValue);
		peliculas.set(7, "Toy story");
		System.out.println(peliculas);
		
		// Conocer el tamaño del ArrayList
		int numElementos = peliculas.size(); 
		System.out.println(numElementos); // Output: 10
		
		// Acceder al último elemento del ArrayList .size()-1
		String ultimaPelicula = peliculas.get(numElementos - 1);
		System.out.println(ultimaPelicula); // Output: Cementerio de mascotas
		
		// Eliminar un elemento mediante su índice .remove(index);
		peliculas.remove(6);
		System.out.println(peliculas); // ya no existe "No manches Frida"
		
		// Recorrer un ArrayList y mostrarlo en forma de lista
		for (var pelicula : peliculas) {
			System.out.println(pelicula);
		}
		
		// Ordenando el ArrayList, utilizamos el método .sort() de Collections
		Collections.sort(peliculas);
		System.out.println(peliculas); // Output: ordenado según ASCII
		
		// Invertir el ArrayList
		Collections.reverse(peliculas);
		System.out.println(peliculas);
		
		// Agregar múltiples elementos a un ArrayList
		salarios.addAll(Arrays.asList(25363.22, 12399.12, 48711.01));
		System.out.println(salarios);
		
		// Cambiando el tipo de estructura de dato con base en su Interface de ArrayList -> LinkedList
		edades = new LinkedList<>();
		edades.addAll(Arrays.asList(23, 22, 23, 21));
		System.out.println(edades);
		System.out.println(edades.getClass().getSimpleName()); // Output: LinkedList
		System.out.println(salarios.getClass().getSimpleName()); // Output: ArrayList

	}

}
