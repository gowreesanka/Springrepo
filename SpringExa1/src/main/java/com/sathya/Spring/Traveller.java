package com.sathya.Spring;

public class Traveller {
	
	private String name;
	private Long mobile;
	private String email;
	Vechicle vechicle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Vechicle getVechicle() {
		return vechicle;
	}
	public void setVechicle(Vechicle vechicle) {
		this.vechicle = vechicle;
	}
	
	public void getStart() {
		
		System.out.println("welcome to taveller world :"+name);
		System.out.println("check your mobile :" +mobile+"email :" +email);
		vechicle.move();
	}

}
