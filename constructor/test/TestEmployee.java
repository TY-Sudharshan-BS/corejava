package com.tyss.constructor.test;

public class TestEmployee {
	public static void main(String[] args) {

//	Employee emp1 = new Employee();
//	emp1.empid = 101;
//	emp1.ename = "raj";
//	emp1.email = "raj@gmail.com";
//	
//	Employee emp2 = new Employee();
//	emp2.empid = 101;
//	emp2.ename = "raj";
//	emp2.email = "ashh";

		Employee e = new Employee(50, "john", "john@gmail");
		System.out.println("emp id is " + e.id);
		System.out.println("emp name is " + e.name);
		System.out.println("emp email is " + e.email);

		Employee e2 = new Employee(51, "smith", "smith@gmail");
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.email);
	}
}
