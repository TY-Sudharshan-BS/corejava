package com.tyss.mock.basics;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("select a number");
		int x = scn.nextInt();
		
		switch (x) {
		case 1:
			System.out.println("sunday");
			break;

		case 2:
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("choose b/w 1 to 7");
			break;
			
		}
		scn.close();
	}
}
