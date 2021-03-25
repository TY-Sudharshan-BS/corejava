package com.tyss.mock.mriding;

public class TestSon {
	public static void main(String[] args) {
//		Son s = new Son();
//		System.out.println(s.age);
//		s.work();
		
		//upcasting
		Father s = new Son();
		System.out.println(s.age);
//		System.out.println(s.marks);
		s.work();
		
		//Downcasting
		Son s1 = (Son)s;
		System.out.println(s1.age);
		System.out.println(s1.marks);
		s1.work();
		s1.play();
				
		
	}
}
