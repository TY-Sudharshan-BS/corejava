package com.tyss.collection.set;

import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(21512);
		ts.add(31512);
		ts.add(1512);
		ts.add(41512);
		ts.add(11512);
//		ts.add("abc"); class cast exception
		System.out.println(ts);

	}
}
