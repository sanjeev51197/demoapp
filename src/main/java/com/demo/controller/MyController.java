package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping
	public String getMessage()
	{
		return "Hello Sanjeev thanks for using kubernates minikube";
	}

}
