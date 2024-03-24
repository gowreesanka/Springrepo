package com.sathya.Spring;

public class Car implements Vechicle {
	
	private String fuelType ;
	private int maxSpeed;
	
	

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public void move() {
		System.out.println("your selected Car vechicle");
		System.out.println("fuel Type..."+fuelType);
		System.out.println("Maximum speed...."+maxSpeed);
	}
	
	
	
		
	

}
