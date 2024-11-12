package org.generation.model;

import org.generation.service.EmployeeService;
import org.generation.service.ManagerService;

public class ManagerMain {

	public static void main(String[] args) {
		// Instanciar Manager
		Manager neri = new Manager(20200123L, "Neri Gutierrez", 69355.22f, 8, 2300f);
		ManagerService managerService = new ManagerService();
		EmployeeService employeeService = new EmployeeService();
		
		System.out.println(neri);
		managerService.supervisar(neri);
		managerService.calcularSalario(neri);
		employeeService.calcularSalario(neri);

	}

}
