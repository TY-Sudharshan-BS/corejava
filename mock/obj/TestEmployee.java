package com.tyss.mock.obj;

public class TestEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee("Sudh", 666);
		Employee emp1 = new Employee("Sudh", 666);
		System.out.println(emp);
		System.out.println();
		System.out.println(emp.hashCode());
		System.out.println();
		System.out.println(emp.equals(emp1));
	}
}
