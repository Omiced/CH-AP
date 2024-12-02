package org.generation.pandevs.service;

import java.util.List;

import org.generation.pandevs.exceptions.UserNotFoundException;
import org.generation.pandevs.model.OrderEntity;
import org.generation.pandevs.model.UserEntity;
import org.generation.pandevs.repository.OrderRepository;
import org.generation.pandevs.repository.UserRepository;
import org.generation.pandevs.service.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	private final OrderRepository orderRepository;
	// Instanciamos UserRepository para inyectarlo y poder usar sus métodos
	private final UserRepository userRepository;

	@Autowired
	public OrderService(OrderRepository orderRepository, UserRepository userRepository) {
		this.orderRepository = orderRepository;
		this.userRepository = userRepository;
	}
	
	// getAllOrders()
	public List<OrderEntity> getOrders() {
		return this.orderRepository.findAll();
	}
	
	// Crear una Order que esté relacionada con un User (dto)
	// Crear un OrderDto para recibir los datos de la Order asociada al idUser
	public OrderEntity createOrder(OrderDto dto) {
		// Buscar el User mediante Id
		UserEntity user = this.userRepository.findById(dto.getIdUser())
				.orElseThrow(() -> new UserNotFoundException(dto.getIdUser()));
		
		// Crear la Order con los atributos de dto
		OrderEntity order = new OrderEntity();
		order.setDate(dto.getDate());
		order.setTotal(dto.getTotal());
		order.setUser(user); // setter de la Relación para asocial al User
		
		// Guardar la Order
		return this.orderRepository.save(order);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
