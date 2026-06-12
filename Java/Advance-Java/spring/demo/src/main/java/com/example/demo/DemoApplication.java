package com.example.demo;

import com.example.demo.config.AppConfiguration;
import com.example.demo.config.PrimaryConfiguration;
import com.example.demo.entity.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		// SpringApplication.run(DemoApplication.class, args);
        /* AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MyBean bean = context.getBean(MyBean.class);
        Thread.sleep(10000);
        context.close();
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
        EmailService emailService = context.getBean(EmailService.class);
        emailService.sendMails();

	}

}
