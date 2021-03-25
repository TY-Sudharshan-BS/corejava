package com.tyss.objectclass.tostring;

public class Person {
	int pid;
	String name;
	String email;
	public Person(int pid, String name, String email) {
		super();
		this.pid = pid;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", email=" + email + "]";
	}
	

}
