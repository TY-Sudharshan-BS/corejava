package com.tyss.basic.commandline;

public class Login {
	public static void main(String[] args) {
		String userName = "admin";
		String userPassword = "manager";
		int args_count = args.length;
		switch (args_count) {
		case 0:
			System.out.println("ERROR: Minimum command line arguments required");

			break;

		case 1:
			System.out.println("both the fields are mandatory");

			break;
		case 2:
			if (userName.equals(args[0]) && userPassword.equals(args[1])) {
				System.out.println("login successful");
			} else {
				System.out.println("incorrect name or password!!!");
			}
			break;
		default:
			System.out.println("Entered fields more than expected");
			break;
		}
	}
}
