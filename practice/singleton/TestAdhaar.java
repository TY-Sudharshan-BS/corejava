package com.tyss.practice.singleton;

public class TestAdhaar {
public static void main(String[] args) {
	System.out.println("main method started");
	
	AdhaarCard.createAdhaar();
	AdhaarCard.createAdhaar();
	
	System.out.println("main method ended");
}
}
