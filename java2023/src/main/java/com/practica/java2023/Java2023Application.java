package com.practica.java2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Java2023Application {

	public static void main(String[] args) {
		SpringApplication.run(Java2023Application.class, args);
	}

}
