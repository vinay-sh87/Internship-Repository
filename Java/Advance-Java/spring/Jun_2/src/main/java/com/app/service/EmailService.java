package com.app.service;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailService implements MessageService {
	@Override
	public void sendMessage(String name) {
		System.out.println("Email service " + name);
	}
}
