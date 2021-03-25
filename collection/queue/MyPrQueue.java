package com.tyss.collection.queue;

import java.util.PriorityQueue;

public class MyPrQueue {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.offer(300);
		pq.offer(200);
		pq.offer(400);
		pq.offer(1000);
		pq.offer(600);
		
		System.out.println(pq);
	}
}
