package com.selfproject.services;

import java.util.List;
import com.selfproject.entities.User;
import com.selfproject.payloads.UserDto;

public interface UserService {

	 UserDto createUser(UserDto userDto);
	 
	 UserDto updateUser(UserDto user, Integer userId);
	 
	 UserDto getUserById(Integer UserId);
	 
	 List<UserDto> getAllUsers();
	 
	 void deleteUser(Integer userId);
}
