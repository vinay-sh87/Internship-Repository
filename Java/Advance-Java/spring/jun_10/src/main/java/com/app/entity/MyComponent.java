package com.app.entity;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    @PostConstruct
    public void first(){
        System.out.println("After component has been initialized");
    }
    @PreDestroy
    public void last(){
        System.out.println("Before the object has been destroyed");
    }
}
