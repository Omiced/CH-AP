package org.generation.pandevs.service;

import java.util.List;

import org.generation.pandevs.exceptions.UserNotFoundException;
import org.generation.pandevs.model.UserEntity;
import org.generation.pandevs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
