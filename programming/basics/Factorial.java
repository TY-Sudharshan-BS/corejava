package com.tyss.programming.basics;

public class Factorial {
	public static int isFact(int num) {
		int out = 1;
		for (int i = num; i > 0; i--) {
			out = out * i;
		}
		return out;
	}

	public static void main(String[] args) {
		int num = 4;
		int answer = isFact(num);
		System.out.println("factorial=" + answer);
	}
}
