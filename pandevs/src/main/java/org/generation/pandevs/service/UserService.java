package org.generation.pandevs.service;

import java.util.List;
// import java.util.Optional;

import org.generation.pandevs.exceptions.UserNotFoundException;
import org.generation.pandevs.model.UserEntity;
import org.generation.pandevs.repository.UserRepository;
import org.generation.pandevs.service.dto.UpdatePasswordUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	
	// Instanciar UserRepository
	private final UserRepository userRepository;
	
	// Inyectar en el constructor
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	// Método para obtener todos los Users
	public List<UserEntity> getAll() {
		return this.userRepository.findAll();
	}
	
	// Método para obtener un User mediante Id
	public UserEntity getById(Long id) {
		return this.userRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));
	}
	
	// Método para crear un nuevo usuario
	public UserEntity createUser(UserEntity newUser) {
		return this.userRepository.save(newUser);
	}
	
	// Método para eliminar un usuario mediante Id
	public void deleteUser(Long id) {
		if (this.userRepository.existsById(id)) {
			this.userRepository.deleteById(id);
		} else {
			throw new UserNotFoundException(id);
		}
	}
	
	// getByEmail() ( JPQL y ResponseEntity<> )
	public UserEntity getByEmail(String email) {
		return this.userRepository.getByEmail(email);
	}
	
	// PUT -> Actualizando toda la entidad (Entity)
	public UserEntity updateUser(UserEntity user, Long id) {
		return userRepository.findById(id)
				.map(userMap -> {
					userMap.setUsername(user.getUsername());
					userMap.setEmail(user.getEmail());
					userMap.setPassword(user.getPassword());
				return userRepository.save(userMap);
		})
			.orElseThrow(() -> new UserNotFoundException(id));
	}
	
	// Método de tipo Optional 
	/*public Optional<Object> updateUser(UserEntity user, Long id) {
		return userRepository.findById(id).map(userMap -> {
			userMap.setUsername(user.getUsername());
			userMap.setEmail(user.getEmail());
			userMap.setPassword(user.getPassword());
			return userRepository.save(userMap);
		});
		//.orElseThrow(() -> new UserNotFoundException(id));
	}*/
	
	
	// PATCH -> Actualizando algunos campos (Data Transfer Object DTO)
	// Crear dentro de service un package dto -> UpdatePasswordUserDto.java
	// Las clases DTO me permiten exponer información (atributos y métodos) parciales de la Entity y de esta manera evitar trabajar con todos los atributos y métodos de la Entity
	// @Transactional anota este método como método de Transacción (ejecución de acciones) entre diferentes clases
	@Transactional
	public void updatePassword(UpdatePasswordUserDto dto) {
		if (!this.userRepository.existsById(dto.getIdUser())) {
			throw new UserNotFoundException(dto.getIdUser());
		}
		this.userRepository.updatePassword(dto.getIdUser(), dto.getPassword());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
