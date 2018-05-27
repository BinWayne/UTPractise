package com.utdemo.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Foo2 {

	@Autowired
	private Bar bar;
	 public boolean checkCodeDuplicate(String code) {
		    return bar.getAllCodes().contains(code);
		  }
	public Bar getBar() {
		return bar;
	}
	public void setBar(Bar bar) {
		this.bar = bar;
	}
	 
	 
}
