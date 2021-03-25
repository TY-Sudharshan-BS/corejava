package com.tyss.collection.set;

import java.util.LinkedHashSet;

public class MyLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("tom");
		lhs.add("Jerry");
		lhs.add("Cat");
		lhs.add("Rat");
		System.out.println(lhs);
		System.out.println(lhs.add("tom"));// doesnot allow duplicate values
	}
}
