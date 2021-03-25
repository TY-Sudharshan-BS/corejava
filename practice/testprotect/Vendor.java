package com.tyss.practice.testprotect;

import com.tyss.practice.protect.Vegetables;
//importing protected class and using it in a subclass
public class Vendor extends Vegetables {
	Vegetables vegetable = new Vegetables();
	void shopping() {
		System.out.println("purchased " + name + "at Rs " + price);
		work();
		
	}
	
	
	
	
}
