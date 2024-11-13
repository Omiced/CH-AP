package org.generation.persona;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	// Instanciar objetos de tipo Persona
	Persona daniel = new Persona ("Daniel", "Maldonado", 37);
	Persona alexis = new Persona("Alexis", "Piña", 26);

	@Test
	@DisplayName("Prueba del nombre de Daniel")
	public void testDaniel() {
		assertEquals("Daniel", daniel.getNombre());
	}
	
	@Test
	@DisplayName("Prueba de la edad de Alexis")
	public void testAlexis() {
		assertEquals(26, alexis.getEdad());
	}
	
	// El fallo (failure) se muestra cuando el resultado esperado de la prueba (test) no coincide
	@Test
	@DisplayName("Prueba para mostrar un fallo")
	public void testFallo() {
		assertEquals(25, daniel.getEdad());
	}
	
	// El error se muestra cuando hay un problema de compilación o algo que no se relacione con el resultado del test
	@Test
	@DisplayName("Prueba para mostrar un error")
	public void testError() {
		assertEquals(25, danie.getEdad());
	}

}
