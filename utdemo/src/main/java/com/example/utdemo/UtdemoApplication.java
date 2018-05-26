package com.example.utdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class UtdemoApplication  {

	@Value("${server.port}")
	private static String port;
	
	public static void main(String[] args) {
		System.out.println(port);
		SpringApplication.run(UtdemoApplication.class, args);
	}
}
