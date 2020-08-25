package com.demo.helloapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RESTDemo {
	@GetMapping
	public String helloWorld() {
		return "helloWorld";
	}

}
