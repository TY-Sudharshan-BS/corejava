package com.tyss.exceptions.trycatch;

public class ArithmeticThrows {
	static void sum() throws ArithmeticException {
		System.out.println(10 / 0);
	}

	public static void main(String[] args) {
		ArithmeticThrows.sum();
		System.out.println("hcdbcdhu");
	}
}
