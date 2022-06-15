package com.example.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.model.Persona;
import com.example.hello.repository.PersoneRepository;

@Service
public class PersoneService {

	@Autowired
	private PersoneRepository personeRepository;
	
	public List<Persona> findAll(){
		return personeRepository.findAll();
	}
}
