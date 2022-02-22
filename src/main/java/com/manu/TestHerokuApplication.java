package com.manu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TestHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestHerokuApplication.class, args);
		System.out.println("Test App Started");
	}

}
