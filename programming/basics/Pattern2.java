package com.tyss.programming.basics;

public class Pattern2 {
	public static void main(String[] args) {
		int n = 5;
		char x = 'a';
		for (int rows = 0; rows < n; rows++) {

			for (int col = 0; rows >= col; col++) {

				System.out.print(x);
			}
			System.out.println();
			x++;
		}
	}
}
