package com.tyss.practice.testprotect;

import com.tyss.inheritance.defaults.Calculator;
import com.tyss.practice.publics.Hotel;

public class TestPublicClass {
	public static void main(String[] args) {
		Hotel h = new Hotel();
		System.out.println(h.name);
		System.out.println(h.area);
		new Calculator();
	}
}
