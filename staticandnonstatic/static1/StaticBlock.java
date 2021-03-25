package com.tyss.staticandnonstatic.static1;

public class StaticBlock {
	
	static {
		System.out.println("first static block");
	}
	static {
		System.out.println("second static block");
	}
	
	static {
		System.out.println("Third static block");
	}
	static {
		System.out.println("Fourth static block");
	}
public static void main(String[] args) {
	System.out.println("main method");
}
}
