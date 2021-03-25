package com.tyss.mockpractice.objects;

public class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "name is " + this.name + " and id is " + this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (this.id != s.id)
			return false;
		else if (this.name != s.name)
			return false;
		else
			return true;

	}

}
