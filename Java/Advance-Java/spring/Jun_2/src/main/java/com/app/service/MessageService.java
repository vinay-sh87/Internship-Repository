package com.app.service;

import org.springframework.stereotype.Service;

@Service
public interface MessageService {
	public void sendMessage(String name);
}
