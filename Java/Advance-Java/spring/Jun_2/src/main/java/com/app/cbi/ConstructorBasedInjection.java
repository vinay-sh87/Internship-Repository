package com.app.cbi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.service.MessageService;

@Component
public class ConstructorBasedInjection {
	private MessageService messageService;

	public ConstructorBasedInjection(@Qualifier("twitter") MessageService messageService) {
		this.messageService = messageService;
	}
	public void processMessage(String name) {
		messageService.sendMessage(name);
	}

}

