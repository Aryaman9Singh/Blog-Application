package com.selfproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selfproject.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	
	
}
