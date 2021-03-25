package com.tyss.mockpractice.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		Student s3 = new Student("sham", 19);
		Student s1 = new Student("ram", 20);
		Student s2 = new Student("raj", 21);
		Student s4 = new Student("iva", 2);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.reverseOrder();
		for (Object s : al) {
			System.out.println(s);
		}

	}
}
