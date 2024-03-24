package com.sathya.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Person person1()
	{
		Person person=new Person();
		person.setName("sankar");
		person.setEmailId("sankar123@gmail.com");
		return person;
	}
}
