package com.app.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PersonForm {
	@NotNull
	@Size(min = 2, max = 20)
	private String name;

	@NotNull
	@Min(value = 18)
	private Integer age;
	
	  
	public PersonForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonForm(@NotNull @Size(min = 2, max = 20) String name, @NotNull @Min(18) Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
