package com.selfproject.payloads;

import java.util.Date;

import com.selfproject.entities.Category;
import com.selfproject.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class PostDto {

	private String title;

	private String content;

	private String imageName;
	
	private Date addedDate;
	
	private Category category;
	
	private User user;

}
