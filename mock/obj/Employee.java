package com.tyss.mock.obj;

public class Employee {
	String name;
	int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return this.name + " " + this.id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

//	@Override
//	public int hashCode() {
//		return 333666;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		Employee e = (Employee) obj;
//
//		return this.name == e.name && this.id == e.id;
//	}
	
	
}
