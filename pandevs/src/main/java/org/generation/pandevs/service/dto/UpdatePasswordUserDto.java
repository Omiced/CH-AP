package org.generation.pandevs.service.dto;

// Dentro de esta clase POJO expongo los atributos necesarios para actualizar solamente el password de un User, como es el punto de entrada (idUser) y el atributo a actualizar (password)
// Los atributos se encapsulan y por lo tanto, necesitamos permitir que se encuentren disponibles y para ello generamos Getters y Setters
public class UpdatePasswordUserDto {
	// Construir una Entity parcial, es decir, solo mando a llamar atributos y métodos de la Entity que voy a utilizar
	private Long idUser;
	private String password;
	
	
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
