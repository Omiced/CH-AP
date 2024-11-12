package org.generation.service;

import org.generation.model.Employee;
import org.generation.model.Manager;

public class ManagerService extends EmployeeService {
	
	// Método único de Manager para supervisar subordinados
	public void supervisar(Manager manager) {
		System.out.println(manager.getNombre() + " está supervisando " + manager.getSubordinados() + " colaboradores");
	}
	
	// Polimorfismo en el método calcularSalario();
	// -- Anulación de métodos (Overriding), debemos tener la misma firma. Es decir, mismo tipo de método, mismo nombre, mismos parámetros pero diferente cuerpo.
	@Override
	public void calcularSalario(Employee empleado) {
		// Determinar si el empleado (Employee) es una instancia de Manager. Si es true, calcular el salario sumando el bono
		if (empleado instanceof Manager) {
			// Necesito realizar un casteo explícito para convertir un Employee en Manager (Employee -> Manager)
			Manager manager = (Manager) empleado;
			float salarioManager = manager.getSalario() + manager.getBono();
			System.out.println(manager.getNombre() + " recibe un salario de Manager de $" + salarioManager);
		}
	}
	
	// -- Sobrecarga de métodos (Overloading), debemos tener diferente firma. Es decir, mismo tipo de métodos, mismo nombre, diferentes parámetros.
	/*
	public void calcularSalario(Manager manager) {
		float salarioManager = manager.getSalario() + manager.getBono();
		System.out.println(manager.getNombre() + " recibe un salario de " + salarioManager);
	}
	*/
	
	
	
}
