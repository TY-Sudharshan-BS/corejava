package com.tyss.exceptions.stacks;

public class Demo {
	public static void doTask() throws Exception {
		System.out.println(10 / 0);

		System.out.println("dotask method called");

	}

	public static void doTask1() throws Exception {
		doTask();
		System.out.println("dotask1 method called");

	}

	public static void doTask2() throws Exception {
		doTask1();
		System.out.println("doTask2 method called");

	}

	public static void main(String[] args) {
		try {
			doTask2();
		} catch (Exception e) {
			System.out.println("exception");
			System.out.println(e.toString());
		}
	}
}
