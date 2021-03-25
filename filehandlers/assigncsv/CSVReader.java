package com.tyss.filehandlers.assigncsv;

import java.io.FileReader;

import java.io.IOException;

import com.tyss.filehandlers.readcsv.CSVReader;

class CSVReader {
	{
	    public static void main( String[] args )
	    {
	       try(FileReader f= new FileReader("Sample-Spreadsheet-10-rows.csv")) {
	    	   CSVReader csvReader =new CSVReader();
	    	   
	    	   String[] nextrecord;
	    	   
	    	   while((nextrecord=csvReader.readNext())!=null) {
	    		   for (String cell:nextrecord) {
	    			    System.out.print(cell+"\t");
				}
	    		   System.out.println();
	    	   }
	    		   csvReader.close();
	    	   
	       }
	       catch (IOException e) {
			System.out.println("file error"+e);
		}
	  
}
