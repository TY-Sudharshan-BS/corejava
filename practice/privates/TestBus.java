package com.tyss.practice.privates;

public class TestBus {
public static void main(String[] args) {
	Bus b = new Bus();
	System.out.println(b.speed);
	
	//cannot access private members outside the class
	/*
	 * b.move(); System.out.println(b.capacity);
	 */
}
}

