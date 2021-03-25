package com.tyss.strings.stringclass;

public class Employee {
	public static void main(String[] args) {
		String x = new String("Jerry");
		String y = new String("Jerry");

		System.out.println(x);
		System.out.println(y);

		System.out.println(x.hashCode());
		System.out.println(y.hashCode());

		System.out.println(x == y); // returns object address
		System.out.println(x.equals(y));

	}
}
