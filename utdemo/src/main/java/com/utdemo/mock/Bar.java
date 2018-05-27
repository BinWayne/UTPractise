package com.utdemo.mock;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Bar {
	private  Set<String> codes;
	
	public Bar(Set<String> codes) {
	      this.codes = codes;
	    }
	public Set<String> getAllCodes() {
	      return codes;
	    }
	
	public Bar() {
	
	}
	
	
}
