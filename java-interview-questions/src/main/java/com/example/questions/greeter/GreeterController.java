package com.example.questions.greeter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
	
	@GetMapping("/greeter")
	public String greeter() {
		return "Hello";
	}

}
