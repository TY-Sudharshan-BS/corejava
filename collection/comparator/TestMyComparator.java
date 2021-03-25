package com.tyss.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TestMyComparator {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet<Integer>(new MyComparator<Integer>());
		ts.add(50);
		ts.add(150);
		ts.add(1000);
		ts.add(70);
		ts.add(20);
		ts.add(100);
		System.out.println(ts);
	}
}
