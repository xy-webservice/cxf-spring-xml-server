package com.xywei.test.hello;

import javax.jws.WebService;

@WebService
public class Helloworld {

	public String sayHelloworld(String message) {
		return message + ", hello!";
	}
}
