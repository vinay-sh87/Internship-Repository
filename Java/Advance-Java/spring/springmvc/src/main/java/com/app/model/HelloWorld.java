package com.app.model;

public class HelloWorld {
	private String name;
	private String course;
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	public HelloWorld(String name, String course) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
