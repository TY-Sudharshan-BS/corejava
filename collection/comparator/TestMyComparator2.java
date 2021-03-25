package com.tyss.collection.comparator;

import java.util.TreeSet;

public class TestMyComparator2 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new MyComparator2<String>());
		ts.add("c");
		ts.add("d");
		ts.add("A");
		ts.add("a");
		ts.add("E");
		ts.add("E");
		ts.add("e");
		ts.add("D");
		System.out.println(ts);
	}
}
