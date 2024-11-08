package org.generation.hashMapCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapCollection {

	public static void main(String[] args) {
		// ---- HashMap ----
		// Almacena datos en pares (key/value) y se puede acceder a ellos mediante index. No es ordenado y no permite datos duplicados
		HashMap<Long, String> estudiantes = new HashMap<>();
		
		// Agregar elementos (K/V) a mi HashMap .put();
		estudiantes.put(2024110601L, "Karla Espinoza");
		estudiantes.put(2024110602L, "César Franco");
		estudiantes.put(2024110603L, "Erick Ortiz");
		estudiantes.put(2024110604L, "Luis Ramos");
		estudiantes.put(2024110605L, "Martha Huerta");
		estudiantes.put(2024110605L, "Martha Huertaaaaa");
		
		System.out.println(estudiantes);
		
		// Recorrer un HashMap mediante forEach
		for (Map.Entry<Long, String> estudiante : estudiantes.entrySet()) {
			Long matricula = estudiante.getKey();
			String nombreEstudiante = estudiante.getValue();
			
			System.out.println("Matricula: " + matricula + ", Estudiante: " + nombreEstudiante);
		}
		
		// Para recuperar el valor a partir de una clave (key) usamos el método .get(key), que permite buscar la clave en el HashMap y devuelve el valor asociado a esa clave.
		Long matricula = 2024110604L;
		String nombreEstudiante = estudiantes.get(matricula);
		
		System.out.println("Estudiante con matricula " + matricula + ": " + nombreEstudiante);
		
		
		// --- TreeMap. Utiliza pares de llave/valor, se encuentra ordenado de manera ascendente (Según tabla ASCII) y no permite duplicados
		TreeMap<String, String> ejemploTreeMap = new TreeMap<>();
		ejemploTreeMap.put("Daniel", "Maldonado");
		ejemploTreeMap.put("Josué", "Cano");
		ejemploTreeMap.put("Jaqui", "Manzano");
		ejemploTreeMap.put("Monse", "Silva");
		ejemploTreeMap.put("Jaqui", "Manzano");
		
		System.out.println(ejemploTreeMap);


		
	}

}
