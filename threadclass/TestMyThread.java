package com.tyss.thread.threadclass;

public class TestMyThread {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
//		MyThread thread1 = null;
//		System.out.println(thread1);
		
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("main thread priority= "+MyThread.currentThread().getPriority());
//		thread.start();
//		thread.start(10);

		thread.setPriority(10);
		System.out.println("my thread priority= " + thread.getPriority());

		thread.start();
		
		
		System.out.println("thread id is " + thread.getId());
		System.out.println("thread name is " + thread.getName());
		

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
		
	}
}
