package com.example.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hello.model.Persona;

public interface PersoneRepository extends JpaRepository<Persona,String>{

}
