package org.generation.hilos;

//Podemos crear un subproceso (thread) a partir de la interface Runnable, es decir, la clase implementa Runnable.
//JVM permite que una aplicación tenga múltiples subprocesos ejecutándose simultáneamente.
public class HiloImplementado implements Runnable {
	// Tenemos que sobreescribir (@Override) el método `run()` para que el código pueda ejecutarse como un subproceso
	
	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("Segundo hilo " + i);
		}
	}
}