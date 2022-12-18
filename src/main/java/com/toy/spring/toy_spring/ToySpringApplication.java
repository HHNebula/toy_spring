package com.toy.spring.toy_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ToySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToySpringApplication.class, args);
	}

}
