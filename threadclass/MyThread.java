package com.tyss.thread.threadclass;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Child thread");
		}
	}

//	public void run(int i) {
//
//		System.out.println("ovedrloading run method");
//	}
//
//	public void start() {
//		System.out.println("start method");
//	}
}
