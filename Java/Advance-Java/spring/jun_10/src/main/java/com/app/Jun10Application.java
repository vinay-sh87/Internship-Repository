package com.app;

import com.app.config.AppConfiguration;
import com.app.entity.MyComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Jun10Application {

	public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MyComponent component = context.getBean(MyComponent.class);

        String value = context.getBean("hello").toString();
        System.out.println(value);
        String dbInfo = context.getBean("dbInfo").toString();
        System.out.println(dbInfo);

        Thread.sleep(10000);
        context.close();
	}

}
