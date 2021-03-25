package com.tyss.inheritance.hierarchial;

public class ParentReference {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.cost = 50000;
		b.move();
		b.start();
		System.out.println(b.cost);
		
		//super class reference and sub class object
		Cycle b1 = new Bike();
		b1.cost = 50000;
		b1.move();
		//b1.start();
	}
}
