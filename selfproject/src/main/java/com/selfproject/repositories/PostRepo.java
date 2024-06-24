package com.selfproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selfproject.entities.Category;
import com.selfproject.entities.Post;
import com.selfproject.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
	
List<Post> findByUser(User user);
List<Post> findByCategory(Category category);


	
	
	
	
}
