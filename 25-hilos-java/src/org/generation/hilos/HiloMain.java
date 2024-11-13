package org.generation.hilos;

public class HiloMain {

	public static void main(String[] args) {
		// Instanciar objetos de los subprocesos
		
		// Instanciando un hilo que hereda
		HiloHeredado hilo01 = new HiloHeredado(); 
		// Instanciando un hilo que implementa
		Thread hilo02 = new Thread(new HiloImplementado());
		
		
		// System.out.println(hilo01); Solo me muestra el hilo y su espacio en memoria
		
		// Para ejecutar los subprocesos debemos llamar un método start();
		hilo02.start();
		hilo01.start();
		
		// -- run(): Ejecuta el código en el hilo actual, sin crear un nuevo hilo. 
		// -- start(): Crea un nuevo hilo y ejecuta el código en él

	}

}
