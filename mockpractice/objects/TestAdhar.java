package com.tyss.mockpractice.objects;

public class TestAdhar {
	public static void main(String[] args) {
		AadharNumber a1 = AadharNumber.checkAdharNum();
		AadharNumber a2 = AadharNumber.checkAdharNum();
		System.out.println(a1.equals(a2));
		AadharNumber.checkAdharNum();
		AadharNumber.checkAdharNum();

	}
}
