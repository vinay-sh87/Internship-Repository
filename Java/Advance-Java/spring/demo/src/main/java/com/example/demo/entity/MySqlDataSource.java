package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataSource implements DataSource{
    @Override
    public String[] getEmails() {
        return new String[] {"tanveer@mysql.com","vinay@mysql.com","eraj@mysql.com"};
    }
}
