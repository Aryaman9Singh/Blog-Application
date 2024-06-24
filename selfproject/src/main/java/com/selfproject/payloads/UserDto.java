package com.selfproject.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	@NotEmpty
	@Size(min = 4, message = "Username must be atleast 4 characters long")
	private String name;
	@Email(message = "Email address is not valid")
	private String email;
	@NotEmpty
	@Size(min = 3, message = "Password cant be this short")
	private String password;
	@NotNull
    private String about;
    
	   

}
