package com.sopovs.moradanen.micrometer.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@SpringBootApplication
public class MicrometerJerseyTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrometerJerseyTestApplication.class, args);
	}

	@Component
	@ApplicationPath("/api")
	public class JerseyConfig extends ResourceConfig {
		public JerseyConfig() {
			register(HelloEndpoint.class);
		}
	}

	@Component
	@Path("/hello/{name}")
	public static class HelloEndpoint {
		@GET
		public String message(@PathParam("name") String name) {
			return "Hello " + name;
		}
	}

}
