package com.tyss.programming.basics;

public class Pallindrome {
	public static void main(String[] args) {
		int num = 1221;
		int temp = num;
		int rev = 0;
		while (num != 0) {
			int last = num % 10;
			rev = rev * 10 + last;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println(temp + " is a pallindrome");
		} else {
			System.out.println(temp + " is not a pallindrome");
		}

	}
}
