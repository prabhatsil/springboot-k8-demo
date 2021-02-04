package com.psil.springboot.k8.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootK8Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootK8Application.class, args);
	}

	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public String sayHello(){
		return "Hello From Spring Boot";
	}

}


