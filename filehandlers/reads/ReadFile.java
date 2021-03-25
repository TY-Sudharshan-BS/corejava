package com.tyss.filehandlers.reads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		try {
			File myObject = new File("F:\\java\\notes\\Filehandling\\student.txt");
			Scanner myReader = new Scanner(myObject);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("error occurred");
			e.printStackTrace();
		}

	}	
}
