package com.tyss.interfaces.finals;

public class Bike {
	final int speed = 100;
	static String name;
	

	

	final void moving() {

		/* speed = 150; cannot re-initialize since final */
		System.out.println("moving method called");
	}
}
