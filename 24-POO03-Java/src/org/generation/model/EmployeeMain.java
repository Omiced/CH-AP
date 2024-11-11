package org.generation.model;

import org.generation.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		// Instanciar objetos
		Employee romina = new Employee(2024110022L, "Romina Loyda", 15233.22f);
		Employee gabriel = new Employee(20220824L, "Gabriel Maldonado", 12588.23f);
		EmployeeService employeeService = new EmployeeService();
		
		System.out.println(romina);
		
		employeeService.calcularSalario(romina);
		employeeService.calcularSalario(gabriel);
		employeeService.trabajar(romina);
		employeeService.infoGeneral(gabriel);

	}

}
