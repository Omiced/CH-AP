package org.generation.pandevs.controller;

import java.util.List;

import org.generation.pandevs.exceptions.UserNotFoundException;
import org.generation.pandevs.model.UserEntity;
import org.generation.pandevs.service.UserService;
import org.generation.pandevs.service.dto.UpdatePasswordUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	// Método para mapear getAll() que viene de Service
	@GetMapping("/pandevs")
	public List<UserEntity> getUsers() {
		return this.userService.getAll();
	}
	
	// Método para mapear getById() usando un PathVariable en el endpoint
	@GetMapping("/pandevs/{id}")
	public UserEntity findById(@PathVariable(name = "id") Long id) {
		return this.userService.getById(id);
	}
	
	// Método para mapear createUser() que viene de Service
	// En postman debo iniciar una solicitud de tipo POST con el endpoint general
	// --- Body -> raw -> JSON
	/*@PostMapping
	public UserEntity newUser(@RequestBody UserEntity user) {
		return this.userService.createUser(user);
	}*/
	
	// Método para crear usuario pero mejorado
	@PostMapping
	public ResponseEntity<UserEntity> newUser(@RequestBody UserEntity user) {
		
		if(this.userService.getByEmail(user.getEmail()) != null) {			
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		return ResponseEntity.ok(this.userService.createUser(user));
	}
	
	// Método para eliminar un user mediante Id
	@DeleteMapping("/delete-user/{id}")
	public void deleteUser(@PathVariable(name = "id") Long id) {
		this.userService.deleteUser(id);
	}
	
	// Método para recuperar un User mediante Email utilizado la Query personalizada y la clase ResponseEntity<>
	@GetMapping("/pandevs/email/{email}")
	public ResponseEntity<UserEntity> getByEmail(@PathVariable(name = "email") String email) {
		UserEntity userByEmail = this.userService.getByEmail(email);
		
		if (userByEmail == null) {
			return ResponseEntity.notFound().build();
		}
		return new ResponseEntity<UserEntity>(userByEmail, HttpStatus.OK);
		// return ResponseEntity.ok(userByEmail);
	}
	
	// Método para Actualizar toda la entidad usando mapeo en PUT
	@PutMapping("/update-user/{id}")
	public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity user, @PathVariable(name = "id") Long id) {
		try {
			return ResponseEntity.ok(this.userService.updateUser(user, id));
		} catch(UserNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}
	
	// Método para actualizar el password mapeando en PATCH
	@PatchMapping("/password")
	public ResponseEntity<Void> updatePassword(@RequestBody UpdatePasswordUserDto dto) {
		try {
			this.userService.updatePassword(dto);
			return ResponseEntity.ok().build();
		} catch (UserNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
