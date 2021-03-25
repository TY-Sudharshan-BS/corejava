package com.tyss.basic.test;

public class Method {

	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	} // end of sum method

	public static void main(String[] args) {
		int res = Method.sum(3, 2);
		System.out.println("Result is " + res);

	}// end of main method

} // end of class

//return type void

//public class Method {
//	
//public static void sum(int a, int b) {
//		int c = a+b;
//		System.out.println("Result is "+ c);
//	} //end of sum method
//
//	
//public static void main(String[] args) {
//	Method.sum(10, 20);
//
//} //end of main method
//} //
