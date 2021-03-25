package com.tyss.objectclass.hashcode;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person(100, "Tony", "tony@gmail.com");
		System.out.println(p.email);
		System.out.println(p.name);
		System.out.println(p.pid);
		System.out.println(p.hashCode());
	}
}
