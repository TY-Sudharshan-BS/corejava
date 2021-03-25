package com.tyss.exceptions.trycatch;

public class ThrowableMethods {
public static void main(String[] args) {
	try {
		System.out.println(10/0);
	} catch (ArithmeticException arithmeticException ) {
		System.out.println("cannot be divi");
//		e.printStackTrace();
//		e.getMessage();
//		e.toString();
	}
}
}
