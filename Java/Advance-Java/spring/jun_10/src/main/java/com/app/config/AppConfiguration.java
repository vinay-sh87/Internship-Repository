package com.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.app")
@PropertySources({
        @PropertySource("classpath:config.properties"),
        @PropertySource("classpath:db.properties")
})

public class AppConfiguration {
    @Value("${student.name}")
    private String name;

    @Value("${teacher.name}")
    private String teacher;

    @Value("${company.name}")
    private String company;

    @Value("${db.driver}")
    private String driver;

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Bean("hello")
    public String showValues() {
        return String.format("Student Name: %s, Teacher Name: %s, Company Name: %s", name, teacher, company);
    }

    @Bean("dbInfo")
    public String getDbInfo() {
        return String.format("Driver %s, Url %s, Username %s, Password %s", driver, url, username, password);
    }
}
