package com.tyss.constructor.test;

public class Person {
	String name = "raj";
	int sal = 400;
	{
		name = "ram";
		sal = 500;
	}

	public Person() {
		name = "rao";
		sal = 600;
	}
}
