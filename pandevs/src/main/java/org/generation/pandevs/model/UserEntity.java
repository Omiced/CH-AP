package org.generation.pandevs.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/*
 * Convertir una clase de Java en una entidad del modelo ER utilizando Spring Data JPA. Para ello necesitamos algunas anotaciones.
 * --- @Entity permite definir una clase como entidad
 * --- @Table(name = "name_table") permite definir el nombre de la tabla que se genera a partir de la entidad
 * */

@Entity
@Table(name = "users")
public class UserEntity {
	
	/*
	 * Definimos las variables de instancia como columnas de la tabla. Hay que configurar las propiedades y valores de cada una de ellas
	 * --- Tenemos que definir idUser como columna PK, AI
	 * --- Tenemos que definir las siguientes columnas con sus propiedades específicas
	 * */
	
	@Id // Indica que es PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Establece la estrategia de Generación del valor, en este caso, una identidad única (AI)
	@Column(name = "id_user") // Anota el atributo como Columna de la tabla con diferentes propiedades
	private Long idUser;
	
	@Column(name = "username", length = 50, nullable = false, unique = true )
	private String username;
	
	@Column(name = "email", length = 100, nullable = false, unique = true)
	private String email;
	
	@Column(name = "password", length = 60, nullable = false, unique = false)
	private String password;
	
	// Definir las relaciones entre las entidades (OneToOne, OneToMany, ManyToMany)
	
	
	// Jpa necesita un constructor vacío para poder trabajar con una entidad
	public UserEntity() {
		
	}

	public UserEntity(Long idUser, String username, String email, String password, List<OrderEntity> orders) {
		this.idUser = idUser;
		this.username = username;
		this.email = email;
		this.password = password;
		this.orders = orders;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserEntity [idUser=" + idUser + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", orders=" + orders + "]";
	}

	// Métodos hashCode() y equals(). Importantes para tener un mayor control al realizar la creación de entidades
	@Override
	public int hashCode() {
		return Objects.hash(email, idUser, orders, password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		return Objects.equals(email, other.email) && Objects.equals(idUser, other.idUser)
				&& Objects.equals(orders, other.orders) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}
	
	
	//----------------------------------------------
	// Relación de User con Order 1:N
	//----------------------------------------------
	
	@OneToMany(mappedBy = "user")
	private List<OrderEntity> orders;
	
	// Getters y Setters de la Relación entre Entidades
	public List<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
