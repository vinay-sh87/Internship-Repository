package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Person;

@RestController
public class HomeController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello... World";
	}

	@GetMapping("/person")
	public Person getPerson() {
		return new Person("Vinay", 50000);
	}

	@GetMapping("/persons")
	public List<Person> getPersons() {
		return List.of(new Person("Mannu", 30000), new Person("Tanveer", 40000));
	}

}
