package com.krupa.joshi.registration.RegistrationForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RegistrationFormApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RegistrationFormApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(RegistrationFormApplication.class, args);
	}

}
