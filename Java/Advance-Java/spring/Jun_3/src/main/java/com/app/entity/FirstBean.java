package com.app.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class FirstBean {
	@Autowired
	private ThirdBean thirdBean;
	@Autowired
	private SecondBean secondBean;
	
	public FirstBean() {
		System.out.println("First bean constructor");
	}
	
	public void populateBeans() {
		secondBean.display();
		thirdBean.display();
	}
	

}
