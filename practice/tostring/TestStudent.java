package com.tyss.practice.tostring;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Tom", 20);
		Student s2 = new Student("Tom", 20);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));	//compares actual content since equals method overridden
		System.out.println(s1 == s2);//compares reference address

		Student s3 = s2;
		System.out.println(s3);
		System.out.println(s3 == s2);
		System.out.println(s3.equals(s2));
		
		System.out.println(s1.hashCode()); //o/p before overriding 366712642

		System.out.println(s2.hashCode()); ////o/p before overriding 1829164700
	}
}
