package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.AuthRequest;
import com.app.util.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private JwtUtil jwtUtil;

	@PostMapping("/login")
	public String login(@RequestBody AuthRequest request) {
		if ("admin".equals(request.getUsername()) && "admin123".equals(request.getPassword())) {
			return jwtUtil.generateToken(request.getUsername());
		}
		return "Invalid Credentials";

	}

}
