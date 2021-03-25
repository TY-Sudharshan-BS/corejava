package com.tyss.synchronization.synchronize;

public class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.println("happy birthday");

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
