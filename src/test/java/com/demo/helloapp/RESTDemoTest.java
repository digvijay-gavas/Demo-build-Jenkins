package com.demo.helloapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RESTDemoTest {

	@Test
	void testHelloWorld() {
		RESTDemo restDemo=new RESTDemo();
		String output=restDemo.helloWorld();
		assertTrue(output.contentEquals("helloWorld"));
	}

}
