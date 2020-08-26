package com.demo.helloapp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.demo.helloapp.pojo.Options;

class RESTDemoTest {

	@Test
	void testHelloWorld() {
		RESTDemo restDemo=new RESTDemo();
		List<Options> options=restDemo.helloWorld();
		assertTrue(options.size()==3);
	}

}
