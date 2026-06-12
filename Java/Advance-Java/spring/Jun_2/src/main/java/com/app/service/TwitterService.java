package com.app.service;

import org.springframework.stereotype.Service;

@Service("twitter")
public class TwitterService implements MessageService{
	@Override
	public void sendMessage(String name) {
		System.out.println("Twitter service " + name);
	}

}
