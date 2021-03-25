package com.tyss.mockpractice.objects;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(1, "xyz");
		Student s2 = new Student(1, "xyz");
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		
		Student s3=s2;
		System.out.println(s3==s2);
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
