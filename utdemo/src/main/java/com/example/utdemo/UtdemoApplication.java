package com.example.utdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.utdemo.*"})
public class UtdemoApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(UtdemoApplication.class, args);
	}
}
