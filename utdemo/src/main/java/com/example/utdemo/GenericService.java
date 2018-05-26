package com.example.utdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class GenericService implements MessageService{

	@Value("${name}")
	private String name;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello "+this.name;
	}
	
	
}
