package com.tyss.mock.constchain;

public class Vehicle {
	double speed;

	public Vehicle(double speed) {
		this.speed = speed;
		System.out.println("vehicle const");
		System.out.println(speed);
	}
}
