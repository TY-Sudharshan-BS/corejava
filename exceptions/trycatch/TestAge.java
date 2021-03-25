package com.tyss.exceptions.trycatch;

public class TestAge {
	

	public void checkAge(int a) throws InvalidAge {
		if (a < 18) {
			throw new InvalidAge("below 18");
		} else {
			System.out.println("welcome to cast your vote");
		}
	}
	public static void main(String[] args) throws InvalidAge {
		TestAge age = new TestAge();
		age.checkAge(19);
	}


	
}
