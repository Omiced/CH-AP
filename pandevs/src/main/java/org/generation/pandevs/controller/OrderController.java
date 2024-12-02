package org.generation.pandevs.controller;

import java.util.List;

import org.generation.pandevs.model.OrderEntity;
import org.generation.pandevs.service.OrderService;
import org.generation.pandevs.service.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	private final OrderService orderService;

	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	// Método para mapear todos las Orders
	@GetMapping
	public List<OrderEntity> getAll() {
		return this.orderService.getOrders();
	}
	
	// Método para mapear una nueva Order
	@PostMapping("/create")
	public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderDto dto) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.orderService.createOrder(dto));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
