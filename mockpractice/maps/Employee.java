package com.tyss.mockpractice.maps;

public class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "name is " + this.name + " and id is " + this.id;
	}
}
