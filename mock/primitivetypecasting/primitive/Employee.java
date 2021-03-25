package com.tyss.primitivetypecasting.primitive;

public class Employee {
	public static void main(String[] args) {
		float salary = 100000.00f;
		int sal = (int) salary;
		System.out.println(sal);

		double d = 130.5;
		byte b = (byte) d;
		System.out.println(b);
		
		long l = 50000000;
		byte x = (byte) l;
		System.out.println(x);

	}

}
