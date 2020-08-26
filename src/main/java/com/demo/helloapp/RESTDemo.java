package com.demo.helloapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.helloapp.pojo.Options;

@RestController
@RequestMapping("/rest")
public class RESTDemo {
	@GetMapping(produces = "application/json")
	public List<Options> helloWorld() {
		List<Options> options=new ArrayList<Options>();
		options.add(new Options("home","navigate to home","/home"));
		options.add(new Options("play","play the game","/play"));
		options.add(new Options("about","about","/about"));
		return options;
	}

}
