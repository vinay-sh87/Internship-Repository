package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
    private DataSource dataSource;

    @Autowired
    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void sendMails(){
        String[] emails = dataSource.getEmails();
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
