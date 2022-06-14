package com.example.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.service.HelloService;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

	@Autowired 
	private HelloService helloService;
    @GetMapping
    public String hello() {
        return helloService.hello();
    }
}
