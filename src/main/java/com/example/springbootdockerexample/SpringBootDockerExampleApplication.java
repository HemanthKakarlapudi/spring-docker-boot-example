package com.example.springbootdockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerExampleApplication {

	@RequestMapping("/hello")
	public String home() {
		return "Hello Spring boot example for docker and kubernetes version 1.0.1-snapshot";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerExampleApplication.class, args);
	}

}
