package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
	
	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {
		
		
		UserDetails userDetails =  User.builder().username("vinuu the ..").password("{noop}123").roles("USER").build();
		
		return new  InMemoryUserDetailsManager(userDetails);
		
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) {
		
		httpSecurity.authorizeHttpRequests(auth->auth.anyRequest().authenticated()).httpBasic(Customizer.withDefaults());
		return httpSecurity.build();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
