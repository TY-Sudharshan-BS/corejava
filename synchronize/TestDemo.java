package com.tyss.synchronization.synchronize;

public class TestDemo {
	public static void main(String[] args) {
		Display disp = new Display();
		System.out.println(Thread.currentThread().isDaemon());
		Mythread thread = new Mythread(disp, 100, "sudh");
		Mythread thread1 = new Mythread(disp, 101, "raj");
		thread.start();
		thread1.start();

	}
}
