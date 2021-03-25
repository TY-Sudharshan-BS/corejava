package com.tyss.basic.test;

public class RelationalOperators {
	public static void main(String[] args) {
		String a = "ram";
		String b = "raj";
//	System.out.println(a<b);

		// comparing characters
		System.out.println('a' > 'b'); // returns boolean

		// comparing strings
//	System.out.println("ab"<"xy"); //error

		System.out.println(10 > 20);

		// cannot compare boolean with result with a number
//	System.out.println(10>20>30); gives compile time error

		// checks for equality
		System.out.println("equality operators");
		System.out.println('a' == 97);
	}
}
