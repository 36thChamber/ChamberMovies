package com.chamber.ChamberMovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chamber.ChamberMovies.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
	
}
