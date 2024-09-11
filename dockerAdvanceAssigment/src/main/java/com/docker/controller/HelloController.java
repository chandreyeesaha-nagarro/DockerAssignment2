package com.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.service.DemoService;

@RestController
public class HelloController {
	
	@Autowired
	private DemoService service;

	@GetMapping("/")
	public String hello() {
		return service.getDemoModel();
	}

}
