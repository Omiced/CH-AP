package com.bankgen.model;

public class CuentaBancaria {
	// Variables de instancia (atributos)
	private Long idCuenta;
	private String propietario;
	private double saldo;
	
	// Método constructor
	public CuentaBancaria(Long idCuenta, String propietario, double saldo) {
		// super(); Se utiliza para recibir un super constructor de una superclase (herencia)
		this.idCuenta = idCuenta;
		this.propietario = propietario;
		this.saldo = saldo;
	}
	
	// Método constructor para Clientes nuevos (idCuenta, propietario, saldo=$0). Usando Overloading iniciamos otro constructor
	public CuentaBancaria(Long idCuenta, String propietario) {
		this.idCuenta = idCuenta;
		this.propietario = propietario;
	}

	// Métodos Getters y Setters
	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Método toString();
	@Override
	public String toString() {
		return "CuentaBancaria= idCuenta: " + idCuenta + ", propietario: " + propietario + ", saldo: $" + saldo;
	}

	
}
