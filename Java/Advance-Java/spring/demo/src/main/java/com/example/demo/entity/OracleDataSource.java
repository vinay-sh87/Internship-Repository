package com.example.demo.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("oracle")
@Primary
public class OracleDataSource implements DataSource {

    @Override
    public String[] getEmails() {
        return new String[]{"manmohan@oracle.com", "suryabhanu@oracle.com"};
    }
}
