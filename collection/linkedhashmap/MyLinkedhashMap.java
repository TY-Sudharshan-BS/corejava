package com.tyss.collection.linkedhashmap;

import java.util.LinkedHashMap;

public class MyLinkedhashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhs = new LinkedHashMap<String, Integer>();
//		lhs.put("age", 54);
//		lhs.put("reg", 100);
//		lhs.put("age", 20);
//		lhs.put("marks", 100);
		
		//maintains insertion order
		lhs.put("id", null);
		lhs.put("", 50);
		lhs.put("", 20);
		lhs.put("adhar", null);
		lhs.put("", 30);
		System.out.println(lhs);
	}
}
