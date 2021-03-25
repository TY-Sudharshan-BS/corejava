package com.tyss.inheritance.defaults;

public class TestCalculator {
	public static void main(String[] args) {
//		ScientificCalculator sc1 = new ScientificCalculator();
		
		SpaceCalculator sp = new SpaceCalculator();
		sp.sum(10, 20);
		sp.difference(10, 30);
		sp.product(5, 2);
		sp.quotient(10, 5);

		sp.square(6);	
		
		sp.mod(10, 5);

	}
}
