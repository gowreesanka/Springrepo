package com.sathya.Spring;

public class Pharmacy {
	
	private String name;
	private String location;
	public Pharmacy(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	public void pharInfo() {
		System.out.println("pharmcy name :"+name);
		System.out.println("Pharmacy Location :"+location);
	}
	}
