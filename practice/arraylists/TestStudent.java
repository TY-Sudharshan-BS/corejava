package com.tyss.practice.arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
	public static void main(String[] args) {
		ArrayList<Student> arrays = new ArrayList<Student>();
		arrays.add(new Student("king", 10));
		arrays.add(new Student("queen", 50));
		arrays.add(new Student("scott", 40));
		arrays.add(new Student("boss", 20));

		Collections.sort(arrays);
		for (Student s : arrays) {
			System.out.println(s);
		}
	}
}
