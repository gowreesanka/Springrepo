package com.sathya.Spring;

 
public class GreetingImpl implements Greeting{

	@Override
	public void greet() {
		System.out.println("good mrng");
		System.out.println("this is java based example");
		
	}
	public GreetingImpl() {
		
		System.out.println("Object Created");
	}
	
	

}
