package com.app.service;

import org.springframework.stereotype.Service;

@Service("sms")
public class SmsService implements MessageService {
	@Override
	public void sendMessage(String name) {
		System.out.println("Sms Service " + name);
	}

}
