package org.generation.pandevs.service.dto;

import java.time.LocalDateTime;

// Aquí vamos a construir la clase con los atributos que si reciben información de Order y el atributo relacionado de User
public class OrderDto {
	
	private LocalDateTime date;
	private Double total;
	private Long idUser; // Id del User para asociar la Order
	
	// getters y setters
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	
	

}
