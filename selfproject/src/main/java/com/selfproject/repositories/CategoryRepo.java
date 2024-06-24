package com.selfproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selfproject.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
	
	

}

