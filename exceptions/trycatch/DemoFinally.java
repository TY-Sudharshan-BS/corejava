package com.tyss.exceptions.trycatch;

public class DemoFinally {
public static void main(String[] args) {
	
	try {
		System.out.println(10/0);
		try {
			
			System.out.println("inner try");
		} 
		finally {
			System.out.println("inner finally");
		}
	} catch(Exception e) {
		System.out.println("exception handled");
		System.exit(0);
	}
	finally {
		
		System.out.println("finally block executing");
	}
}
}
