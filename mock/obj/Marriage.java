package com.tyss.mock.obj;

public class Marriage {
	private static Marriage marry;

	public static Marriage getMarriage() {
		if (marry == null) {
			marry = new Marriage();
			System.out.println("happy married life");
			return marry;
		} else {
			System.out.println("already married");
			return marry;
		}
	}

	public static void main(String[] args) {
		Marriage m1 = Marriage.getMarriage();
		Marriage m2 = Marriage.getMarriage();
		System.out.println(m1 == m2);
	}
}
