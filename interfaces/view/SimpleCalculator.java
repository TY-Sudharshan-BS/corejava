package com.tyss.interfaces.view;

public class SimpleCalculator extends NormalCalculator {

	@Override
	public void product() {
		System.out.println("multiplication");
	}

	@Override
	public void quotient() {
		System.out.println("division");
	}

}
