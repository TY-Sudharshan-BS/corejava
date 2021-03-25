package com.tysss.myproperties.propertiesfile;

import java.io.FileInputStream;
import java.util.Properties;

public class FileReader {
	public static void main(String[] args) throws Exception {
		FileInputStream inputstream = new FileInputStream("myprop.properties");
		Properties pro = new Properties();
		pro.load(inputstream);
		String name = (String) pro.get("name");
		String salary = (String) pro.get("salary");

		System.out.println("name " + name + " salary===" + salary);

	}
}
