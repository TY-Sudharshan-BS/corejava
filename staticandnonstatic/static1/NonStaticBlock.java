package com.tyss.staticandnonstatic.static1;

public class NonStaticBlock {
	int id;
	String name;
	static double sal;
	{
		id = 420;
		System.out.println("first non-static block");
	
	}
	{
		name = "dinga";
		System.out.println("second non-static block");
	}
	{
		System.out.println("third non-static block");
	}
	{
		sal = 500.0;
		System.out.println("fourth non-static block");
	}
	static{
		System.out.println("static block called");
	}
	
}
