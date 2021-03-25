package com.tyss.filehandlers.assigncsv;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
	public static void main(String[] args) 
	{
		
		try(FileReader fr = new FileReader("book.csv"))
		{
			CSVReader csvReader = new CSVReader(fr);
			
			String[] nextRecord;
			
			
			List<String> csvArr1 = new ArrayList<>();
			List<String> csvArr2 = new ArrayList<>();
			
			int rows = 0;
			int cols = 0;
			
			
			StringBuffer sb = new StringBuffer();
			
			while((nextRecord = csvReader.readNext()) != null)
			{
				rows++;
				for(String cell : nextRecord)
				{
					if(rows <= 1)
					{
						csvArr1.add(cell);
					}
					else
					{
						csvArr2.add(cell);
					}

					cols++;
				}
			} 
		
				
			for(String s1 : csvArr1)
			{
				System.out.print(s1);       // numerical value
			}
			System.out.println();
			
			for(String s2 : csvArr2)
			{
				System.out.print(""+s2);    // charater value
			}
			
			for(String s3 : csvArr2)
				
			{
				
				sb.append(s3);
				
			}
			
			System.out.println();
			
			StringBuffer arr1=sb;
			
			int nextCol = csvArr1.size()+1;
			
			System.out.println(nextCol);   //position value
			System.out.println("read done");
			
			
			
			
	        try (FileWriter fw = new FileWriter("sample.csv");
				        CSVWriter writer= new CSVWriter(fw);)
	        {
	        	
	        	
	        	
	        	String [] s12= {arr1.toString()};
	        	writer.writeNext(s12);
	        	System.out.println("write done");
	     	    
	        }
	        
		
        } catch (IOException e) {
			
			System.err.println("error");
		}
	}
}
