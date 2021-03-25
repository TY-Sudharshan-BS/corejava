package com.tyss.collection.linkedlists;

import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		ll.add(500);
		ll.add(400);
		ll.add(100);
		ll.addLast(666);
		ll2.add(200);
		ll2.add(300);
		ll2.add(100);
		
		System.out.println(ll);
		System.out.println(ll2);
		
		ll.addFirst(007);
		
		
		System.out.println(ll);
		
		ll.addAll(ll2);
		System.out.println(ll);
	}
}
