package com.training.cg.day2;

import java.util.Scanner;

import org.w3c.dom.ranges.RangeException;

public class Student {
	
		public static void Display(String StudName, int[] marks, String Subjects[], int sum) {
	    	System.out.println("Name : "+ StudName);
	    	System.out.println("Marks obtained ::");
	    	
	    	for (int i=0;i<6;i++) {
	    		System.out.println(Subjects[i]+ " : "+marks[i]);
	    		
	    	}
	    	System.out.println("Total Marks are "+ sum);
	    	int avg= sum/6;
	    	int per= (sum*100)/300;
	    	System.out.println("Percentage "+per);
	    	System.out.println("Average is "+ avg);
	    	
	    }
	
	public static void main(String args[]) {
	 String StudName;
	 Scanner sc= new Scanner(System.in);
    int [] marks= new int[6];
    final String Subjects[]= new String[] {"JAVA","DBMS","IOT","VLSI","EMBEDDED","Circuits"};
    int sum=0;
    System.out.println("Enter name of the Student ");
    StudName=sc.next();
         System.out.println("Enter marks obtained");
       	for(int i=0;i<6;i++) {
       		marks[i]=sc.nextInt();
    		if(marks[i]>=0 && marks[i]<=50) {
    		    sum=sum+marks[i];
    		}
    		else {
    			throw new RangeException((short) 0, "Maximum marks are 50");
    		}
    	}
    Display(StudName,marks,Subjects,sum);
    
 
   
}
}