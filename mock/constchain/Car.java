package com.tyss.mock.constchain;

public class Car extends Vehicle {
	double speed;

	public Car(double speed) {
		super(60);
		this.speed = speed;
		System.out.println("car constructor");
	}
}
