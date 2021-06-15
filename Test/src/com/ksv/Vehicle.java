package com.ksv;

public class Vehicle {

	void printChareterestics(Class<? extends Vehicle> name){
		System.out.println("Charaterestics of "+ name.getClass().getSimpleName());
		System.out.println(getCharaterestics());
		
	}
	
	String getCharaterestics(){
		return "Good build quality";
	}
}
