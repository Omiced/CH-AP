package org.generation.model;

// Un Developer también es un empleado con nombre completo, número de empleado, salario pero también recibe los atributos de lenguaje de programación y nivel de dominio
public class Developer extends Employee{
	// Atributos
	LenguajesProgramacion lenguajeProgramacion;
	NivelDominio nivelDominio;
	
	// Constructor
	public Developer(Long numEmpleado, String nombre, float salario, LenguajesProgramacion lenguajeProgramacion,
			NivelDominio nivelDominio) {
		super(numEmpleado, nombre, salario);
		this.lenguajeProgramacion = lenguajeProgramacion;
		this.nivelDominio = nivelDominio;
	}

	// Getters y Setters
	public LenguajesProgramacion getLenguajeProgramacion() {
		return lenguajeProgramacion;
	}

	public void setLenguajeProgramacion(LenguajesProgramacion lenguajeProgramacion) {
		this.lenguajeProgramacion = lenguajeProgramacion;
	}

	public NivelDominio getNivelDominio() {
		return nivelDominio;
	}

	public void setNivelDominio(NivelDominio nivelDominio) {
		this.nivelDominio = nivelDominio;
	}

	// toString()
	@Override
	public String toString() {
		return "Developer= numEmpleado: " + numEmpleado + ", nombre: " + nombre + ", salario: $" + salario
				+ ", lenguajeProgramacion: " + lenguajeProgramacion + ", nivelDominio: " + nivelDominio;
	}
	
	
	
	
	
}
