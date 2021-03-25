package com.tyss.practice.hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		HashMap<Student, Integer> hashmap = new HashMap<Student, Integer>();
		Student st = new Student("sudh");
		Student st1 = new Student("smith");
		Student st2 = new Student("Boss");

		hashmap.put(st, 10);
		hashmap.put(st1, 20);
		hashmap.put(st2, 30);

		Set<Student> set = hashmap.keySet();

		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
