package com.sathya.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class JavaConfig {
	
	@Bean
	public GreetingImpl greet() {
		
		GreetingImpl greetingImpl=new GreetingImpl();
		return greetingImpl;
		
	}

}
