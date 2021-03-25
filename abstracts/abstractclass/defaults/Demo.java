package com.tyss.abstractclass.defaults;

public abstract class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public abstract void doStuff();

	int x;

	public static void Greet() {
		System.out.println("hello");
	}

	public void doTask() {
		System.out.println("doTask method running");
	}

	public void doJob() {
		System.out.println("job done");
	}

	public abstract void doWork();
}
