package com.tyss.exceptions.trycatch;

public class Arrays {
	public static void main(String[] args) {
		int arr1[] = { 20, 30, 20, 50 };
		System.out.println("main method started");

		try {
			System.out.println(arr1[20]);
		} catch(ClassCastException e) {
			System.out.println("classcast exception");
			
		} /*
			 * catch (ArrayIndexOutOfBoundsException e) {
			 * System.out.println("ArrayIndexOutOfBoundsException"); System.out.println("");
			 * }
			 */ catch (ArithmeticException e) {
			System.out.println("ArithmeticException");

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		} catch(Exception e) {
			System.out.println("Exception");
		} //cannot write child excepion since the exception is alreday handled by 
		/*
			 * catch(NumberFormatException e) { System.out.println("NumberFormatException");
			 * }
			 */
		System.out.println("remaining lines of code ");

	}
}
