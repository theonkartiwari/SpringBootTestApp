package com.onkar.springboottestapp.runner;

import org.springframework.boot.CommandLineRunner;

public class MyClassRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Welcome to Spring Boot Onkar");
		System.out.println("I have modified the files");
	}

}
