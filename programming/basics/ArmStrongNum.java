package com.tyss.programming.basics;

public class ArmStrongNum {
	public static void main(String[] args) {
		int num = 153;
		boolean res = isArm(num);
		if (res) {
			System.out.println(num + " is a Armstrong number ");
		} else {
			System.out.println(num + " is not a Armstrong number ");
		}
	}

	public static boolean isArm(int num) {
		int sum = 0;
		int temp = num;
		while (num != 0) {
			int last = num % 10;
			int out = isExp(last);
			sum = sum + out;
			num = num / 10;
		}
		return temp == sum;

	}

	public static int isExtract(int num) {

		int count = 0;
		while (num != 0) {
			int last = num % 10;
			count++;
			num = num / 10;

		}
		return count;
	}

	public static int isExp(int last) {
		int result = 1;
		int power = isExtract(last);
		while (power != 0) {
			result = result * last;
			power--;

		}
		return result;

	}
}
