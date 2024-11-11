package com.bankgen.logic;

import com.bankgen.exceptions.FondosInsuficientesException;
import com.bankgen.model.CuentaBancaria;

// Métodos que el objeto puede implementar (comportamiento)
public class CuentaBancariaService {
	
	// Consultar saldo
	public void consultar(CuentaBancaria cuenta) {
		System.out.println("Tu saldo es de $" + cuenta.getSaldo());
	}
	
	// Depositar dinero
	public void depositar(CuentaBancaria cuenta, double monto) {
		double actualizarSaldo = cuenta.getSaldo() + monto;
		cuenta.setSaldo(actualizarSaldo); 
		// cuenta.setSaldo(cuenta.getSaldo() + monto); 2da opción
	}
	
	// Retirar dinero. Crear exception que me evalúa si puedo retirar dinero según mi saldo. Para ello, debo indicar que este método implementa la Exception (throws)
	public void retirar(CuentaBancaria cuenta, double retiro) throws FondosInsuficientesException {
		if (retiro <= cuenta.getSaldo()) {
			cuenta.setSaldo(cuenta.getSaldo() - retiro);
		} else {
			throw new FondosInsuficientesException(cuenta.getSaldo());
		}
	}
	
	
}
