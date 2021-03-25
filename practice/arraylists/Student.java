package com.tyss.practice.arraylists;

public class Student implements Comparable<Student> {
	String name;
	int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "name is " + this.name + " and id is " + this.id;
	}

	@Override
	public int compareTo(Student o) {
		return o.name.compareTo(this.name);
	}

}
