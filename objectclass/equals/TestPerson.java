package com.tyss.objectclass.equals;

public class TestPerson {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Sudh", 5);
		 Employee e2 = new Employee(100, "Sudh", 5); 
		
		
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
		
		
	}
}
