package com.tyss.constructor.overloading;

public class Demo {
	protected void disp() {
		System.out.println("disp method called");
	}

	public Demo() {
		System.out.println("default constructor");
	}

	public Demo(int age) {
		System.out.println("single argument constructor");
	}

	public Demo(int sal, String name) {
		System.out.println("multiple argument constructor");
	}

}
