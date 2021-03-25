package com.tyss.mock.supers;

public class Son extends Father {
	int age;

	public Son(int age) {
		System.out.println("sub class constructor");
		System.out.println("sub age " + age);
	}
//	public Son() {
//		System.out.println("def son const");
//	}

}
