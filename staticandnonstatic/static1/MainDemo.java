package com.tyss.staticandnonstatic.static1;

public class MainDemo {
public static void main(String[] args) {
	//accessing static variables using classname
	System.out.println("name of employee is "+ Demo.name); 
	System.out.println("id of employee is "+ Demo.id);
	
	//reinitialising static variables
	Demo.id = 122113;
	System.out.println("new id is "+Demo.id);
	//accessing static methods using classname
	Demo.work();
}
}
