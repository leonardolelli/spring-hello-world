package com.example.hello.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String hello() {
		return "Hello World!";
	}

	public String helloCustom(String name) {
		return String.format("Hello %s!", name);
	}

}
