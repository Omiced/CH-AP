package org.generation.model;

public class Manager extends Employee {
	
	// Atributos 
	private int subordinados;
	private float bono;
	
	// Constructor 
	public Manager(Long numEmpleado, String nombre, float salario, int subordinados, float bono) {
		super(numEmpleado, nombre, salario);
		this.subordinados = subordinados;
		this.bono = bono;
	}

	// Getters y Setters
	public int getSubordinados() {
		return subordinados;
	}

	public void setSubordinados(int subordinados) {
		this.subordinados = subordinados;
	}

	public float getBono() {
		return bono;
	}

	public void setBono(float bono) {
		this.bono = bono;
	}

	// toString()
	@Override
	public String toString() {
		return "Manager= numEmpleado: " + numEmpleado + ", nombre: " + nombre + ", salario: $" + salario + ", nùmero de subordinados: " + subordinados + ", bono: $" + bono;
	}
	
}
