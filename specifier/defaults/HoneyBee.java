package com.tyss.specifier.defaults;

 class HoneyBee {
	public static void main(String[] args) {
		Flower f = new Flower();
		
		//accessing default members from different class
		f.bloom();
		System.out.println(f.color);

	}
}
