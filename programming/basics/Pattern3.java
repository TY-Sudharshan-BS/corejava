package com.tyss.programming.basics;

public class Pattern3 {
	public static void main(String[] args) {
		int n = 4;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col < n; col++) {
				if (rows + col <= n - 1)
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
