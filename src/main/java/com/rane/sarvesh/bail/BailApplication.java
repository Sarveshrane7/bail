package com.rane.sarvesh.bail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BailApplication {

	public static void main(String[] args) {
		SpringApplication.run(BailApplication.class, args);
		System.err.println("started");
	}

}
