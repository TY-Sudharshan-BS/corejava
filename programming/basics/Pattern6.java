package com.tyss.programming.basics;

public class Pattern6 {
	public static void main(String[] args) {
		int n = 5;
		int count = 1 ;
		for (int rows = 0; rows < n; rows++) {
			
			for (int col = 0; rows >= col; col++) {
				
				System.out.print(count+" ");
				
			}
			System.out.println();
			count++;
		}
	}
}
