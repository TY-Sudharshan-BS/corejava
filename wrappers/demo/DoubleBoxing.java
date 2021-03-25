package com.tyss.wrappers.demo;

public class DoubleBoxing {
	public static void main(String[] args) {
		double salary = 10000.333;
		Double doubled = new Double(salary);
		System.out.println("autoboxing value is "+doubled);
		
		double d = (double) doubled;
		System.out.println("autounboxing value is "+d);
	}
}
