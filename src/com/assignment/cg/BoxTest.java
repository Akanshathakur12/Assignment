package com.assignment.cg;

import java.util.Scanner;

public class BoxTest {

	public static void main(String[] args) {

		Box b = new Box(null);
		  @SuppressWarnings("resource") 
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the length , breadth and height of the box");
		  b.length=sc.nextDouble();
		  b.breadth=sc.nextDouble();
		  b.height=sc.nextDouble();
		 
		System.out.println("Volume of the box is: " + b.volume());

	}

}
