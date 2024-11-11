package org.generation.service;

import org.generation.model.Employee;

// Vive la lógica de mi modelo
public class EmployeeService {
	
	// Método para mostrar una acción
	public void trabajar(Employee empleado) {
		System.out.println(empleado.getNombre() + " está trabajando");
	}
	
	// Método para calcular el salario
	public void calcularSalario(Employee empleado) {
		System.out.println("El salario de " + empleado.getNombre() + " es de $" + empleado.getSalario());
	}
	
	// Método para mostrar información general
	public void infoGeneral(Employee empleado) {
		System.out.println("Nombre: " + empleado.getNombre() + ". Número de empleado: " + empleado.getNumEmpleado() + ". Salario: $" + empleado.getSalario());
	}
	
}
