package com.tyss.mock.customtry;

public class Login {
	public static void main(String[] args) {
		String name = "admin";
		int password = 123;
		if (name.equals("admin")) {
			if (password == 1234) {
				System.out.println("login successfull");
			} else {
				try {
					throw new InvalidPasswordException();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
