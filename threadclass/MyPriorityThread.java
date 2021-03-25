package com.tyss.thread.threadclass;

public class MyPriorityThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Child thread");
		}
	}
}
