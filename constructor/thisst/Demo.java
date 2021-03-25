package com.tyss.constructor.thisst;

public class Demo {
	public Demo() {
		this(100);
		System.out.println("default constructor");
	}

	public Demo(int x) {
		this(50, 50.0);
		System.out.println("Demo(int) vonstructor ");
	}

	public Demo(int x, double y) {
		this(20.0);
		System.out.println("Demo(int, double) constructor ");
	}

	public Demo(double y) {

		System.out.println("Demo(double) constructor");
	}
}
