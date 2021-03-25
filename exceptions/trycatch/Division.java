package com.tyss.exceptions.trycatch;

public class Division {
	public static void main(String[] args) {
		try {
			System.out.println("try block started");
			System.out.println("Division of 10/0 is " + 10 / 0);
			System.out.println("try block ended");
			try {
				System.out.println("");
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			try {
				System.out.println("");
			} catch (ArithmeticException e1) {
				System.out.println("ArithmeticException");
			}
			System.out.println("catch block started");
			System.out.println("cannot be divided by zero");
			System.out.println("catch block ended");
		}

	}
}
