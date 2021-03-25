package com.tyss.thread.threadclass;

public class TestMyRunnable {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 10; i < 20; i++) {
			System.out.println("inside main method " + i);
		}

	}
}
