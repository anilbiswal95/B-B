package com.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan({"com.startup.controller"})
//@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/*
	 * @GetMapping("/") public String test() { return "Hi"; }
	 */
	 
}
