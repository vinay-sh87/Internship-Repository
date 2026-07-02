package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/student")
	public String getStudent()
		{
		
			String course=restTemplate.getForObject("http://COURSE-SERVICE/course", String.class);
			
			
			return "We are enrolled in ::"+course;
		
		
		
		}

}
