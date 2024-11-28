package org.generation.pandevs.exceptions;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// Método constructor que evalúa un parámetro (Long id) y lanza un mensaje 
	public UserNotFoundException(Long id) {
		super("El usuario con el id: " + id + " no existe!!!");
	}

}
