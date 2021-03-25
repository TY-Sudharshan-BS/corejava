package com.tyss.collection.hashmaps;

import java.util.HashMap;

public class MyHashMap2 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
//		hm.put("age", 54);
//		hm.put("reg", 100);
//		hm.put("age", 20);
//		hm.put("marks", 100);

		//doesnot maintain insertion order
		hm.put("id", null);
		hm.put("", 50);
		hm.put("", 20);
		hm.put("adhar", null);
		hm.put("", 30);
		System.out.println(hm);
		
	}
}
