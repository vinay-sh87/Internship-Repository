package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;

import com.app.entity.FirstBean;
import com.app.entity.HelloBean;
import com.app.entity.SecondBean;
import com.app.entity.ThirdBean;

@Configuration
public class AppConfiguration {
	public AppConfiguration() {
		System.out.println("Configuration...");
	}
	@Bean("first")
	@DependsOn({"second","third"})
	public FirstBean callFirstBean() {
		return new FirstBean();
	}
	
	@Bean("second")
	public SecondBean callSecondBean() {
		return new SecondBean();
	}
	
	@Bean("third")
	public ThirdBean callThirdBean() {
		return new ThirdBean();
	}
	
	@Bean
	@Scope("singleton") // prototype
	public HelloBean helloBean() {
		return new HelloBean();
	}
	
	
}
