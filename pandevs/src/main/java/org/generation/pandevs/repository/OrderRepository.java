package org.generation.pandevs.repository;

import org.generation.pandevs.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
	
}
