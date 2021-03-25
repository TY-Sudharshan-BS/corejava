package com.tyss.practice.hasa;

public class Customer {
	String name;
	int age;
	String gender;
	SocialMedia media;
	Address address;

	public Customer(String name, int age, String gender, SocialMedia media, Address address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.media = media;
		this.address = address;
	}

}
