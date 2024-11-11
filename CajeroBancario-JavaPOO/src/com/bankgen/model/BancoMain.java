package com.bankgen.model;

import com.bankgen.exceptions.FondosInsuficientesException;
import com.bankgen.logic.CuentaBancariaService;

public class BancoMain {

	public static void main(String[] args) {
		// Instanciar objetos de las dos clases
		CuentaBancaria cuentaDaniel = new CuentaBancaria(2024111101L, "Daniel Maldonado", 100d); // Usuario existente
		CuentaBancaria cuentaJikme = new CuentaBancaria(2024111102L, "Jikmé López"); // Usuario nuevo
		// Instancia de la clase Service
		CuentaBancariaService cuentaService = new CuentaBancariaService();
		
		System.out.println(cuentaDaniel);
		System.out.println(cuentaJikme);
		
		// Consultar saldo
		cuentaService.consultar(cuentaJikme); // Output: $100
		cuentaService.consultar(cuentaDaniel); // Output: $0
		
		// Depositar dineros
		cuentaService.depositar(cuentaJikme, 50000);
		cuentaService.consultar(cuentaJikme); // Outut: $50000
		
		// Retirar dineros
		try {
			cuentaService.retirar(cuentaDaniel, 100);
		} catch (FondosInsuficientesException e) {
			System.out.println("Saldo insuficiente");
		}
		
		// Consultar a Daniel después del retiro de dinero
		cuentaService.consultar(cuentaDaniel); // Output: $0
		
		// Ingresar dinero a la cuentaDaniel y mostrar el saldo
		cuentaService.depositar(cuentaDaniel, 500);
		cuentaService.consultar(cuentaDaniel); // Output: $500

	}

}
