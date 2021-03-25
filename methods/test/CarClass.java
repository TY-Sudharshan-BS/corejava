package com.tyss.basic.test;

public class CarClass {


	public static void main(String...args) {
	
		//creating an object of class car
	Car c = new Car();
	
	//accessing the properties using ref. variable 
	System.out.println("car name is "+ c.name);
	System.out.println("car brand is "+ c.brand);
	System.out.println("car price is "+ c.price);
	System.out.println("car color is "+ c.color);
	
	c.drive();
	}// main method ended
}
