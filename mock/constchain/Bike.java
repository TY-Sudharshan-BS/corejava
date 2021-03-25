package com.tyss.mock.constchain;

public class Bike extends Car {
	double speed;

	public Bike(double speed) {
		super(50);
		this.speed = speed;
		System.out.println("bike constructor");
		System.out.println(this.speed + " "+ speed);
	}
}
