package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	@GetMapping("/")

	public String getMessage() {
		return "Hello World";
	}
	@PostMapping("/{input}")

	public String postMessage(@PathVariable String input) {
		
		return "Hello World Mr: " + input;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
