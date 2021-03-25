package com.tyss.practice.hasa;

public class TestHasA {
	public static void main(String[] args) {
		Address address = new Address(333, "RPC layout", "Vijayanagar", "Bengaluru", 560040);
		SocialMedia socialmedia = new SocialMedia("sudh@gmail", "Sudh777@facebook", "sudh_official666@twitter");
		Customer cust = new Customer("Sudharshan", 24, "male", socialmedia, address);
	
		System.out.println("customer name is " + cust.name);
		System.out.println("customer age is " + cust.age);
		System.out.println("customer gender is " + cust.gender);

		System.out.println("customer door_no is " + cust.address.door_no);
		System.out.println("customer street_name is " + cust.address.street_name);
		System.out.println("customer area is " + cust.address.area);
		System.out.println("customer city is " + cust.address.city);
		System.out.println("customer pincode is " + cust.address.pincode);

		System.out.println("customer email_id is " + cust.media.email_id);
		System.out.println("customer fb_id is " + cust.media.fb_id);
		System.out.println("customer twitter_id is " + cust.media.twitter_id);
	}
}
