package org.generation.hilos;

// Podemos crear un subproceso (thread) a partir de la super clase Thread, es decir, la subclase hereda de Thread.
// JVM permite que una aplicación tenga múltiples subprocesos ejecutándose simultáneamente.
public class HiloHeredado extends Thread {
	// Tenemos que sobreescribir (@Override) el método `run()` para que el código pueda ejecutarse como un subproceso
	
	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("Primer hilo " + i);
		}
	}
}
