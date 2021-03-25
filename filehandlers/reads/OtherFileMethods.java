package com.tyss.filehandlers.reads;
import java.io.File;
public class OtherFileMethods {
	public static void main(String[] args) {
		File myObject = new File("F:\\java\\notes\\Filehandling\\student.txt");
		if(myObject.exists()) {
			System.out.println("file name is: "+myObject.getName());
			System.out.println("file path is: "+myObject.getAbsolutePath());
			System.out.println("file size is: "+myObject.length());
			System.out.println("Readable: "+myObject.canRead());
			System.out.println("writable: "+myObject.canWrite());
		} else {
			System.out.println("file doesnot exist");
		}
	}

}
