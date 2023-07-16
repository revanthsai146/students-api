package com.example.demo;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		final Logger logger=LoggerFactory.getLogger(DemoApplication.class);		
		SpringApplication.run(DemoApplication.class, args);
		logger.info("In Main Function");
		
		
	}

}
