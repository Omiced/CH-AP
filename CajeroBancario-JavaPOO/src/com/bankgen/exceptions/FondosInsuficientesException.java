package com.bankgen.exceptions;

// Clase para crear una Exception personalizada que extiende que la clase Exception
public class FondosInsuficientesException extends Exception {
	
	// Serie agregada por default ya que Exception implementa la interface Serializable
	private static final long serialVersionUID = 1L;
	
	// Atributos
	private double fondos;

	// Constructor
	public FondosInsuficientesException(double fondos) {
		this.fondos = fondos;
	}

	// Getters y Setters
	public double getFondos() {
		return fondos;
	}

	public void setFondos(double fondos) {
		this.fondos = fondos;
	}
		
}
