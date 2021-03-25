package com.tyss.mockpractice.sets;

public class Mobile {
	int price;
	String brand;

	public Mobile(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "mobile name is " + this.brand + " price is " + this.price;
	}
	
	

}
