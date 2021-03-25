package com.tyss.programming.trywithres;

import java.io.FileOutputStream;

public class TryWithResources {
	public static void main(String args[]) {
		try (FileOutputStream fileOutputStream = new FileOutputStream("F:\\java\\notes\\trywithres.txt");) {

			String msg = "Welcome to TestYantra!";
			byte byteArray[] = msg.getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
			System.out.println("written to file successfuly!");
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}
