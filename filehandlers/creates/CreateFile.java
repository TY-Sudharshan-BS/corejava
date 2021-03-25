package com.tyss.filehandlers.creates;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			File myObject = new File("F:\\java\\notes\\Filehandling\\student.txt");
			if (myObject.createNewFile()) {
				System.out.println("file created and file name is: " + myObject.getName());
				System.out.println(myObject.getAbsolutePath());
			} else {
				System.out.println("file already exists");
			}
		} catch (IOException e) {
			System.out.println("error occurred in creating file");
			e.printStackTrace();
		}
	}
}
