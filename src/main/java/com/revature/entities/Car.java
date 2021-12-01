package com.revature.entities;

public class Car {
	private String make;
	private String model;
	private String color;
	private String type;
	private String plateNumber;
	
	public Car(String make, String model, String color, String type, String plateNumber) {
		// TODO Auto-generated constructor stub
		this.make = make;
		this.model = model;
		this.color = color;
		this.type = type;
		this.plateNumber = plateNumber;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getType() {
		return type;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
}
