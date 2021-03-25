package com.tyss.staticandnonstatic.static1;

public class Demo2Main {
public static void main(String[] args) {
	System.out.println("emp id is "+ Demo2.eid);
	Demo2.emp1();
	System.out.println();
	
	Demo2 d2=new Demo2();
	System.out.println("emp salary is "+d2.salary);
	d2.emp2();
	
	//new object
	Demo2 d3 = new Demo2();
	d3.salary = 80000;
	System.out.println("salary with new object "+d3.salary);
}
}
