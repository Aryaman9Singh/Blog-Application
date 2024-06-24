package com.selfproject.payloads;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


@NoArgsConstructor
@AllArgsConstructor

public class ApiResponse {
	private String message;
	private boolean success;
	

}
