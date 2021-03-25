package com.tyss.mock.ll;

import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(20);
		ll.add("boss");
		ll.add(30.25);
		ll.add(true);
		ll.add(null);
		for (Object o : ll) {
			System.out.println(o);
		}
		
		System.out.println("============");
		ll.set(1, 100);
		for (Object o : ll) {
			System.out.println(o);
		}	
	}
	
}
