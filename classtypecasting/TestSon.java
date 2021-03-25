package com.tyss.javaclasstypecasting.classtypecasting;

public class TestSon {
	public static void main(String[] args) {
		//upcasting
		Father f = new Son();
		f.test();
		//superclass reference and subclass object
		/* f.work(); */
		
		//downcasting
		Son s = (Son)f;
		s.work();

	}
}
