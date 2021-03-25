package com.tyss.practice.singleton;

public class TestPresident {
	public static void main(String[] args) {
		President obj = President.createPresidentObj();
		System.out.println("president name " + obj.name);

		President obj1 = President.createPresidentObj();
		System.out.println("president name " + obj1.name);
	}
}
