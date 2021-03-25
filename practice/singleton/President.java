package com.tyss.practice.singleton;

public class President {
	String name = "Abdul Kalam";
	private static President pres;

	private President() {
		// TODO Auto-generated constructor stub
	}

	public static President createPresidentObj() {
		if (pres == null) {
			pres = new President();
			System.out.println("president object created");
			return pres;
		} else {
			System.out.println("already created");
			return pres;
		}
	}
}
