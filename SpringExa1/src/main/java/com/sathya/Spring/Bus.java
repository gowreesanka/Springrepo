package com.sathya.Spring;

public class Bus implements Vechicle{
	
	private String busType;
	private int maxSpeed;
	
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public void move() {
		System.out.println("your selected Bus vechicle");
		System.out.println("Bus Type..."+busType);
		System.out.println("Maximum speed...."+maxSpeed);
	}
	
	

}
