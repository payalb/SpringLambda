package com.example.demo;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringLambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLambdaApplication.class, args);
	}

	@Bean
	public Function<String, String> returnUpperCase(){
		return (x)-> x.toUpperCase();
	}
}
