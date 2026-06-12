package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.app")
public class AppConfiguration {
	public AppConfiguration() {
		System.out.println("Hello Bean");
	}
	@Bean("tannu")
	public String helloBean() {
		return "Hello tannu";
	}
	@Bean("vinay")
	public HelloBean myBean() {
		HelloBean helloBean = new HelloBean();
		helloBean.setMessage("Mannu");
		return helloBean;
	}

}
