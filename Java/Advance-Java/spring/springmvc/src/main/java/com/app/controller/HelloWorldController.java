package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.HelloWorld;
import com.app.model.SignUpForm;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public String helloWorld(Model model) {
		HelloWorld world = new HelloWorld();
		world.setCourse("Java Full Stack Developer");
		world.setName("tanveer");
		model.addAttribute("student", world);
		return "home";
	}

	@ModelAttribute("user")
	public SignUpForm getUser() {
		return new SignUpForm();
	}

	@GetMapping("showForm")
	public String showForm() {
		return "signup-form";
	}

	@PostMapping("saveUser")
	public String savedUser(@ModelAttribute("user") SignUpForm currentUser, Model model) {
		model.addAttribute("user", currentUser);
		return "user-detail";
	}

}
