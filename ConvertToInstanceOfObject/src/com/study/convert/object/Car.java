package com.study.convert.object;

public class Car {

	int price;
	String model;
	String type;
	
	public Car(int price, String model, String type) {
		this.price = price;
		this.model = model;
		this.type = type;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
