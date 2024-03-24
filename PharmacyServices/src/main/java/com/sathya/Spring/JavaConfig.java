package com.sathya.Spring;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	
	@Bean
	public Doctor doctor() {
		Doctor doctor=new Doctor(101, "Sankar");
		return doctor;
	}
	
	@Bean
	public Pharmacy pharmacy() {
		
		Pharmacy pharmacy=new Pharmacy("WHO","Hyderbad");
		return pharmacy;
	}
	@Bean
	public Patient patient() {
		
		Patient patient=new Patient("Arun", 25, doctor(),pharmacy());
		return patient;
	}
	
	

}
