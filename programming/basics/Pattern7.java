package com.tyss.programming.basics;

public class Pattern7 {
	public static void main(String[] args) {
		int n = 6;
		
		for (int rows = 0; rows < n; rows++) {
			int count = 1;
			for (int col = 0; rows >= col; col++) {

				System.out.print(count+" ");
				count++;
			}
			System.out.println();
			
		}
}
}
