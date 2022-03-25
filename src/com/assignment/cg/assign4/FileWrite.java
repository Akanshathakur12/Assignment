package com.assignment.cg.assign4;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		
		
		try {
			FileOutputStream file=new FileOutputStream("test.txt");
			
		     //Checking if the file creation is successful or not
	         if(file != null) {
			  System.out.println("file is created successfully"); 
			  } else
			 { 
				  System.out.println("Failed to create a file"); 
				  }
	         
			 //writing byte values into file
			file.write(65);
			file.write(68);
			
			
			//writing string 
			String s1="\n";
			 byte b1[]=s1.getBytes();
			 file.write(b1);
			String s= "Writing input from java code!\n using outputstreamclass";
			 byte b[]=s.getBytes();
			 file.write(b);
			 System.out.println(file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		
		
		
		
		

	}

}
