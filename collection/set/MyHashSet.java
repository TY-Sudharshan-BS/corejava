package com.tyss.collection.set;

import java.util.HashSet;

public class MyHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		hs.add(600);
		hs.add(600);
		System.out.println(hs);
		
	}
}
