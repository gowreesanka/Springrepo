package com.sathya.Spring;

public class Person {
	
	private String name;
	private String emailId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public void personInfo() {
		
		
		System.out.println("hey"+name+"welcome to sathya tech");
		System.out.println("your email is "+emailId+" u will get the updates");
	}

}
