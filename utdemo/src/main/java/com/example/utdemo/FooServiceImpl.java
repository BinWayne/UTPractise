package com.example.utdemo;

import org.springframework.stereotype.Component;

@Component
public class FooServiceImpl {

	public int count = 0;
	
	public int getCount() {
		return this.count;
	}
	
	public void plusCount() {
		this.count++;
	}
}
