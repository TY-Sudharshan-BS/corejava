package com.tyss.basic.test;

public class Arrays {
public static void main(String[] args) {
	int [] age = new int[3];
	age[0] = 10;
	age[1] = 20;
	age[2] = 30;
	//for loop
//	for(int i =0;i<age.length; i++  ) {
//		System.out.println(age[i]);
//	}
	
	//foreach loop
	for(int arr: age) {
		System.out.println(arr);
	}
//	System.out.println("sum of ages is "+ (age[0]+age[1]+age[2]));
	
	
	//syntax 2
	double[] marks = {100,20,50.5,60.5};
	for(int j=0;j<marks.length;j++) {
		System.out.println(marks[j]);
	}
}
}
