package com.tyss.collection.queue;

import java.util.concurrent.PriorityBlockingQueue;

public class MyBlockedQueue {
	public static void main(String[] args) {
		PriorityBlockingQueue pb = new PriorityBlockingQueue();
		pb.offer(500);
		pb.offer(300);
		pb.offer(800);
		pb.offer(100);
		pb.offer(250);
		System.out.println(pb);
	}
}
