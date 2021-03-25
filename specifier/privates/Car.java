package com.tyss.specifier.privates;

public class Car {
	private static int speed = 50;
	
	//cannot create instance 
	private Car() {
	}

	private static void ride() {
		System.out.println("IM a rider method");
	}
	public static void main(String[] args) {
		System.out.println(speed);
		ride();
//		Car c = new C();
	}
}
