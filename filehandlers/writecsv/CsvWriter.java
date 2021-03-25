package com.tyss.filehandlers.writecsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CsvWriter {
	public static void main(String[] args) {

		try (PrintWriter writer = new PrintWriter(new File("F:\\java\\notes\\CSV.csv"))) {

			StringBuilder s = new StringBuilder();
			s.append("id,");
			s.append("Name");
			s.append(',');
			s.append('\n');

			s.append("101");
			s.append(',');
			s.append("Sudharshan");
			s.append('\n');

			s.append("102");
			s.append(',');
			s.append("Jeevan");
			s.append('\n');

			s.append("103");
			s.append(',');
			s.append("Tom");
			s.append('\n');

			writer.write(s.toString());

			System.out.println("records added");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
}
