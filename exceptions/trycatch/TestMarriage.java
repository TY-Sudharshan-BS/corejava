package com.tyss.exceptions.trycatch;

public class TestMarriage {
	public void verifyAge(int a) {
		if(a<21) {
			throw new Marriage("below 21");
//			System.out.println("hjjshskh"); cannot write stmts after 
		} else {
			System.out.println("happy married life");
		}
	}
}
