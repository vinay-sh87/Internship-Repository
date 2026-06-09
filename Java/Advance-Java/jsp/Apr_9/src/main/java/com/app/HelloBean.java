package com.app;

public class HelloBean {

	private String message;
	public HelloBean() {
		super();
	}
	public HelloBean(String message) {
		this.message = message;
	}
	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
