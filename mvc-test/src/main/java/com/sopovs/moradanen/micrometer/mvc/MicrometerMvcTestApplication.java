package com.sopovs.moradanen.micrometer.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MicrometerMvcTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrometerMvcTestApplication.class, args);
	}

	@RestController
	public static class HelloController {

		@GetMapping("/hello/{name}")
		public String hello(@PathVariable(name = "name") String name){
			return "Hello " + name;
		}
	}

}
