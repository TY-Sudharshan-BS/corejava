package com.tyss.interfaces.view;

public abstract class NormalCalculator implements Calculator {

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("addition");
	}

	@Override
	public void diffference() {
		// TODO Auto-generated method stub
		System.out.println("subtraction");
		
	}

	@Override
	public abstract void product() ;
		// TODO Auto-generated method stub
		
	

	@Override
	public abstract void quotient();
	

}
