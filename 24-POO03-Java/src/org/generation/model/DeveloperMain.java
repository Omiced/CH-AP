package org.generation.model;

import org.generation.service.EmployeeService;

public class DeveloperMain {

	public static void main(String[] args) {
		// Instanciar Developer
		Developer edgar = new Developer(20210322L, "Edgar Lee", 26344.11f, LenguajesProgramacion.JAVA, NivelDominio.MIDDLE);
		
		System.out.println(edgar);
		
		// Instanciar EmployeeService
		EmployeeService employeeService = new EmployeeService();
		
		employeeService.calcularSalario(edgar);

	}

}
