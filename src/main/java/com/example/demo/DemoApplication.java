package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		final Logger logger=LoggerFactory.getLogger(DemoApplication.class);		
		SpringApplication.run(DemoApplication.class, args);
		logger.info("In Main Function");
		
		
	}
	 

}
