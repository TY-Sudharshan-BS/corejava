package com.tyss.programming.basics;

public class RecursiveFactorial {
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));

	}

	public static void main(String[] args) {
		int fact = 1;
		int num = 4;

		fact = factorial(num);
		System.out.println(fact);
	}
}
