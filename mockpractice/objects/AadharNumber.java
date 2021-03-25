package com.tyss.mockpractice.objects;

public class AadharNumber {
	private static AadharNumber a_num = null;

	private AadharNumber() {
		System.out.println("private constructor");
	}

	static AadharNumber checkAdharNum() {
		if (a_num == null) {
			a_num = new AadharNumber();
			System.out.println("adhar created");
			return a_num;
		} else {
			System.out.println("already created");
			return a_num;

		}

	}
}
