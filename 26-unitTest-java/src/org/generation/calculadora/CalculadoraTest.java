package org.generation.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private Calculadora calculadora = new Calculadora();
	
	@Test
	@DisplayName("Prueba de suma")
	public void sumar() {
		assertEquals(20, calculadora.sumar(10, 10));
	}
	
	@Test
	@DisplayName("Prueba de resta")
	public void restar() {
		assertEquals(20, calculadora.restar(50, 30));
	}
	
	@Test
	@DisplayName("Prueba de multiplicación")
	public void multiplicar() {
		assertEquals(50, calculadora.multiplicar(5, 10));
	}
	
	 @Test
	 @DisplayName("Prueba de división")
	 public void dividir() {
		 assertEquals(50, calculadora.dividir(50, 1));
	 }
	 
	 @Test
	 @DisplayName("División entre cero")
	 public void dividirEntreCero() {
		 assertEquals(null , calculadora.dividir(20, 0));
	 }
	 
}
