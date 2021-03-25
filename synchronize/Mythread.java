package com.tyss.synchronization.synchronize;

public class Mythread extends Thread {
	Display disp;
	int id;
	String name;

	public Mythread(Display disp, int id, String name) {
		super();
		this.disp = disp;
		this.id = id;
		this.name = name;
	}

	@Override
	public void run() {
		disp.wish(name);
	}

}
