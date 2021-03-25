package com.tyss.exceptions.stacks;

public class Test {
	public static void doTask() {
		System.out.println("dotask method called");
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void doTask1() {
		doTask();
		System.out.println("dotask1 method called");

	}

	public static void doTask2() {
		doTask1();
		System.out.println("doTask2 method called");

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		doTask2();
		System.out.println("main method ended");
	}
}
