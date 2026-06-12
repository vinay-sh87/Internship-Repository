package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.cbi.ConstructorBasedInjection;

public class FirstActivity {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext myContainer = new AnnotationConfigApplicationContext(AppConfiguration.class);
		String value = (String) myContainer.getBean("tannu");
		System.out.println(value);
		HelloBean helloBean = (HelloBean) myContainer.getBean("vinay");
		System.out.println(helloBean.getMessage());

		ConstructorBasedInjection cbi = (ConstructorBasedInjection) myContainer
				.getBean(ConstructorBasedInjection.class);
		cbi.processMessage("Tanveer");
	}
}
