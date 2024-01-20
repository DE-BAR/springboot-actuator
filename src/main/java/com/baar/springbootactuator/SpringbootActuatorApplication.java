package com.baar.springbootactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootActuatorApplication {


	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootActuatorApplication.class, args);
	}

}
