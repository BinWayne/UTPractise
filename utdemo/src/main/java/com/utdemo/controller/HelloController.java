package com.utdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utdemo.service.MessageService;

@RestController
public class HelloController {

	@Autowired
	private MessageService messageService;
	 
	@RequestMapping("/hello")
	public String  hello() {
		return messageService.getMessage();
	}
}
