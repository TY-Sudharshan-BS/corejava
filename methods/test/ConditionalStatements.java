package com.tyss.basic.test;

public class ConditionalStatements {
public static void main(String[] args) {
//	int a=10;
//	int b=5;
//	if(a>b);
//	System.out.println(a);

	int marks = 100;
	
	if(marks>100) {
		System.out.println("enter marks below 100");
	
	}
		else if(marks<=100 && marks>80) {
		System.out.println("grade A");
	} else if(marks<80 && marks>60) {
		System.out.println("Grade B");
	} else if(marks<60 && marks>40) {
		System.out.println("Grade C");
	} else {
		System.out.println("fail");
	}

}
}
