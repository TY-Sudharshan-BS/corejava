package com.tyss.mockpractice.maps;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "name is " + this.name + " id is " + this.id;
	}

	@Override
	public int compareTo(Student o) {
		return o.name.compareTo(this.name);
	}

}
