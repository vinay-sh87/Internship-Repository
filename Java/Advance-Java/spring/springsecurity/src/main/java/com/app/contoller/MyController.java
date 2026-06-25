package com.app.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "hello--user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}

}
