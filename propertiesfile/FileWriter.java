package com.tysss.myproperties.propertiesfile;

import java.io.FileOutputStream;
import java.util.Properties;

public class FileWriter {
	public static void main(String[] args) throws Exception {
		FileOutputStream outputstream = new FileOutputStream("first.properties");
		Properties pro = new Properties();
		pro.setProperty("name", "Sudh");
		pro.setProperty("email", "Sudh@gmail.com");
		pro.store(outputstream, "comments");
		System.out.println("property file created");
	}
}
