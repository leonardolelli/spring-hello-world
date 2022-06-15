package com.example.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.model.Persona;
import com.example.hello.service.PersoneService;

@RestController
@RequestMapping("/api/persone")
public class PersoneController {

	@Autowired
	private PersoneService personeService;
	
    @GetMapping("/data")
    public List<Persona> getPersone() {
    	return personeService.findAll();
    }
	
}
