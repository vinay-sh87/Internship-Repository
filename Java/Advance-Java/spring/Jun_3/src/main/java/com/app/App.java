package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfiguration;
import com.app.entity.FirstBean;
import com.app.entity.HelloBean;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		FirstBean been = context.getBean(FirstBean.class);
		been.populateBeans();

		HelloBean been1 = context.getBean(HelloBean.class);
		System.out.println("The object is :: " + been1);
		HelloBean been2 = context.getBean(HelloBean.class);
		System.out.println("The object is :: " + been2);

	}
}
