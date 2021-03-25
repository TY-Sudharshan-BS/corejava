package com.tyss.thread.threadclass;

public class TestMyPriority {
	public static void main(String[] args) {
		MyPriorityThread mypriority = new MyPriorityThread();
		System.out.println(Thread.currentThread().isDaemon());

		System.out.println("main thread priority= " + MyPriorityThread.currentThread().getPriority());


		mypriority.setPriority(1);
		System.out.println("my thread priority= " + mypriority.getPriority());

		mypriority.start();


		System.out.println("thread name is " + mypriority.getName());
		System.out.println("thread id is " + mypriority.getId());

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}

	}
}
