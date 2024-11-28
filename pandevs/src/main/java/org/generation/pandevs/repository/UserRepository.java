package org.generation.pandevs.repository;

import org.generation.pandevs.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// En esta Interface voy a heredar de la JPA para poder utilizar todas sus características
// JpaRepository recibe la Entidad sobre la cual va a actuar y el tipo de dato de la PK
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	// JPQL
	@Query("SELECT u FROM UserEntity u WHERE u.email = ?1")
	UserEntity getByEmail(String email);
	
}
