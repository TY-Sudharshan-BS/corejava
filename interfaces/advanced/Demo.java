package com.tyss.interfaces.advanced;

public interface Demo {
	public void greet();

	//concrete methods from jdk1.8 (only static, default)
	default void message() {
		System.out.println("please reply");
	}

	static void text() {
		System.out.println("static text method called");
	}
}
