package com.tyss.mockpractice.maps;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TestStudentByTreeMap {
	public static void main(String[] args) {
		Student s1 = new Student(7, "msd");
		Student s2 = new Student(18, "vk");
		Student s3 = new Student(12, "uv");
		Student s4 = new Student(10, "srt");
		TreeMap<Student, Integer> tm = new TreeMap<Student, Integer>();
		tm.put(s1, 2);
		tm.put(s2, 1);
		tm.put(s3, 4);
		tm.put(s4, 3);
		Set<Student> s = tm.keySet();
		Iterator<Student> itr = s.iterator();
		while (itr.hasNext()) {
			Student stud = itr.next();
			Integer integer = tm.get(stud);

			System.out.println(stud + " and marks is " + integer);
		}
	}
}
