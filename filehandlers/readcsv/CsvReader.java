package com.tyss.filehandlers.readcsv;

import java.io.*;
import java.util.Scanner;

public class CsvReader {
	public static void main(String[] args) {

		// parsing a CSV file into Scanner class constructor
		try {
			Scanner sc = new Scanner(new File("F:\\java\\notes\\CSV.csv"));
			sc.useDelimiter(","); // sets the delimiter pattern
			while (sc.hasNext()) // returns a boolean value
			{
				System.out.print(sc.next() + "\t"); // find and returns the next complete token from this scanner
			}
			sc.close(); // closes the scanner
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
