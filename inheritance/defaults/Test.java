package com.tyss.inheritance.defaults;

public class Test {
public static void main(String[] args) {
	
	Employee e1 = new Employee();
	
	System.out.println(e1.pid); //person class
	System.out.println(e1.pname); //person class
	System.out.println(e1.email); //employee
	e1.address(); //person
	e1.designation(); //employee
}
}
