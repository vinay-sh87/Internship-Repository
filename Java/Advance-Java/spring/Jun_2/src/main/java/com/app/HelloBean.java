package com.app;

import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloBean {
	String message;
	public HelloBean(String _message) {
		this.message = _message;
	}
	public HelloBean() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
