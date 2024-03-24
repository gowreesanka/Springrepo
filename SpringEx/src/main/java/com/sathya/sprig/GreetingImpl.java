package com.sathya.sprig;

public class GreetingImpl implements Greeting{

	@Override
	public void greet() {
		
		System.out.println("*****");
		System.out.println("This is Spring first Ex");
		
	}
	public GreetingImpl() {
		System.out.println("object created");
	}

}
