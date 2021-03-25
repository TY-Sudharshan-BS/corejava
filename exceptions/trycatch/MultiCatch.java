package com.tyss.exceptions.trycatch;

public class MultiCatch {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			
			e.printStackTrace();
		}
	}
}
