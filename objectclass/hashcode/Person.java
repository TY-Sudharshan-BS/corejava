package com.tyss.objectclass.hashcode;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pid;
		return result;
	}

 

	
	

	

	 

}
