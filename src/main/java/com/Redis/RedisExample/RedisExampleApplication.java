package com.Redis.RedisExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisExampleApplication.class, args);
		System.out.println("Server has been started");
	}

}
