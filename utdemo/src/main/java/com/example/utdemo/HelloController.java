package com.example.utdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private MessageService messageService;
	 
	@RequestMapping("/hello")
	public String  hello() {
		return messageService.getMessage();
	}
}
