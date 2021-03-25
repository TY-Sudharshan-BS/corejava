package com.tyss.basic.test;

public class LoopingStatements {
	public static void main(String[] args) {
		// type 1
//	for(int i=0;i<10;i++) {
//		System.out.println(i);
//	}

		// Type 2
//	int n = 5;
//	int i = 1;
//
//	for(;; ) {
//		
//		System.out.println("value of i is "+ i);
//		
//	}

		// Type 3
//	int i=1;
//	int n=10;
//
//	for(System.out.println("hello"); i<n;i++) {
//		System.out.println("for loop "+i);
//	}

		// Type 4
		for (int i = 0; i < 10; System.out.println("increment/decrement")) {
			System.out.println("hello");
		}
	}
}
