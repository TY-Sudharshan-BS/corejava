package com.tyss.practice.singleton;

public class AdhaarCard {
	private static AdhaarCard ac = null;

	private AdhaarCard() {
		System.out.println("private constructor created");
	}

	public static AdhaarCard createAdhaar() {
		if (ac == null) {
			ac = new AdhaarCard();
			System.out.println("adhaarCard created successfully");
			return ac;
		} else {
			System.out.println("this adhaar number already exists");
			return ac;
		}
	}
	
}
