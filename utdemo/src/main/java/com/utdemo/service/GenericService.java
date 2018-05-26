package com.utdemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
@PropertySource("classpath:property-source.properties")
public class GenericService implements MessageService{

	@Value("${foo}")
	private String name;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello "+this.name;
	}
	
	
}
