package com.selfproject.services;

import java.util.List;

import com.selfproject.entities.Post;
import com.selfproject.payloads.PostDto;

public interface PostService {

	
	
	//create
 PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
 
 //update
 Post updatePost(PostDto postDto, Integer postId);
 
 //delete
  void deletePost(Integer postId);
  
  //getAllPosts
  
  List<Post> getAllPost();
  
  //getSinglePost
  
  Post getPostById(Integer postId);
  
  
  //getAll post by category
  
   List<Post> getPostsByCategory(Integer categoryId); 
   
   //get all posts by user
   
   List<Post> getPostsByUser(Integer userId);
   
   //search posts
   List<Post> searchPosts(String keyword);
   
}
