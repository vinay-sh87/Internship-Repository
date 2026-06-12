package com.example.demo.config;

import com.example.demo.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean(initMethod = "myInit", destroyMethod = "myDestroy")
    public MyBean getBean() {
        return new MyBean();
    }
}
