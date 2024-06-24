package com.selfproject.services;

import java.util.List;

import com.selfproject.payloads.CategoryDto;

public interface CategoryService {

	//create
CategoryDto createCategory(CategoryDto categoryDto);
	
	
	//update
 CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	//delete
 public void deleteCategory(Integer categoryId);

	//get
	CategoryDto getCategory(Integer categoryId);

	//get All
List<CategoryDto> getCategories();

}
