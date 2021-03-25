4package com.tyss.filehandlers.writes;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("F:\\java\\notes\\Filehandling\\student.txt");
			myWriter.write("im writing the first line of the file");
			myWriter.close();
			System.out.println("wrote the file successfully");
		} catch (IOException e) {
			System.out.println("error occurred");
			e.printStackTrace();
		}
	}
}
