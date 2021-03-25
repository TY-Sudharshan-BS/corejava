package com.tyss.practice.functionalInterfaces;

//using the implementation of interface in an anonymous class
public class TestBoy {
	public static void main(String[] args) {
		Boy boy = () -> {
			System.out.println("boy is playing");
		};
		boy.play();
	}
}
