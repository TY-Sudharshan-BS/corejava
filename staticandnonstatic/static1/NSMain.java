package com.tyss.staticandnonstatic.static1;

public class NSMain {
	static {
		System.out.println("static block inside main class");
	}
	
public static void main(String[] args) {
	
	System.out.println("main method started");
	
	NonStaticBlock ns=new NonStaticBlock();
	System.out.println(ns.id);
	System.out.println(ns.name);
	//System.out.println(ns.sal); static filed cannot be accessed in a non-static way
	System.out.println(NonStaticBlock.sal);
	
	System.out.println("*************");
	
//	NonStaticBlock ns2=new NonStaticBlock();
	}
}
