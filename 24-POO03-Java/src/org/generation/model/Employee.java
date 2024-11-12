package org.generation.model;

import org.generation.repository.EmployeeRepository;

public class Employee implements EmployeeRepository{

	// Variables de instancia
	Long numEmpleado;
	String nombre;
	float salario;
	
	// Constructor 
	public Employee(Long numEmpleado, String nombre, float salario) {
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.salario = salario;
	}
	
	// Getters y Setter
	public Long getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(Long numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Employee= numEmpleado: " + numEmpleado + ", nombre: " + nombre + ", salario: $" + salario;
	}

	
}
