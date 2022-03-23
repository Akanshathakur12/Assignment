package com.training.cg.day2;

import java.util.Scanner;

public class MovieApp {

	public static void main(String args[]) {
		 
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Welcome to the movie ticket reservation app");
	     System.out.println("The theatres near your location are");
	         System.out.println("1-Karunya Theatre\n"+"2-Anna Theatre\n"+"3-Alankar thetre\n"+"4-INOX Mall");
	         System.out.println("Please select the theatre you want to visit");
	         int ch=sc.nextInt();
	         switch(ch){
	             case 1:
	                 System.out.println("The movies currently running in Karunya Theatre are:");
	                 System.out.println("1.RRR\n"+"2.Avengers\n"+"3.Bacchan pandey\n"+"Select the movie you want to watch\n");
	                 int ch2=sc.nextInt();
	                 System.out.println("Ticket price per head is Rs.80");
	                 System.out.println("Enter the number number of tickets to be booked ");
	                 int num=sc.nextInt();
	                 System.out.println("Issuing Ticket...........");
	                 if(ch2==1) {
	                	 System.out.println("Theatre:------ Karunya Theatre\n"+"Movie:------RRR\n"+"Cost:------Rs."+(80*num));
	                 }else if(ch2==2) {
	                	 System.out.println("Theatre:------ Karunya Theatre\n"+"Movie:------Avengers\n"+"Cost:------Rs."+(80*num));
	                 }else if(ch2==3) {
	                	 System.out.println("Theatre:------ Karunya Theatre\n"+"Movie:------Bacchan pandey\n"+"Cost:------Rs."+(80*num));
	                 }
	                 else {
	                	 System.out.println("Select available movies ");
	                 }
	                 
	                 break;
	             case 2:
	            	 System.out.println("The movies currently running in Anna Theatre are:");
	                 System.out.println("1.BheemlaNayak\n"+"2.RRR\n"+"Select the movie you want to watch\n");
	                 int ch3=sc.nextInt();
	                 System.out.println("Ticket price per head is Rs.90");
	                 System.out.println("Enter the number number of tickets to be booked ");
	                 int num1=sc.nextInt();
	                 System.out.println("Issuing Ticket...........");
	                 if(ch3==1) {
	                	 System.out.println("Theatre:------ Anna Theatre\n"+"Movie:------BheemlaNayak\n"+"Cost:------Rs."+(90*num1));
	                 }else if(ch3==2) {
	                	 System.out.println("Theatre:------ Anna Theatre\n"+"Movie:------RRR\n"+"Cost:------Rs."+(90*num1));
	                 }
	                 else {
	                	 System.out.println("Select available movies ");
	                 }
	                 
	                 break;
	             case 3:
	            	 
	            	 System.out.println("The movies currently running in Alankar Theatre are:");
	                 System.out.println("1.Famegame\n"+"2.Pushpa\n"+"Select the movie you want to watch\n");
	                 int ch4=sc.nextInt();
	                 System.out.println("Ticket price per head is Rs.70");
	                 System.out.println("Enter the number number of tickets to be booked ");
	                 int num2=sc.nextInt();
	                System.out.println("Issuing Ticket...........");
	                 if(ch4==1) {
	                	 System.out.println("Theatre:------ Alankar Theatre\n"+"Movie:------Famegame\n"+"Cost:------Rs."+(70*num2));
	                 }else if(ch4==2) {
	                	 System.out.println("Theatre:------ Alankar Theatre\n"+"Movie:------Pushpa\n"+"Cost:------Rs."+(70*num2));
	                 }
	                 else {
	                	 System.out.println("Select available movies ");
	                 }
	                 break;
	             case 4:
	            	 System.out.println("The movies currently running in INOX Mall are:");
	                 System.out.println("1.salute\n"+"2.Spiderman\n"+"Select the movie you want to watch\n");
	                 int ch5=sc.nextInt();
	                 System.out.println("Ticket price per head is Rs.90");
	                 System.out.println("Enter the number number of tickets to be booked ");
	                 int num3=sc.nextInt();
	                 System.out.println("Issuing Ticket...........");
	                 if(ch5==1) {
	                	 System.out.println("Theatre:------ Anna Theatre\n"+"Movie:------salute\n"+"Cost:------Rs."+(90*num3));
	                 }else if(ch5==2) {
	                	 System.out.println("Theatre:------ Anna Theatre\n"+"Movie:------Spiderman\n"+"Cost:------Rs."+(90*num3));
	                 }
	                 else {
	                	 System.out.println("Select available movies ");
	                 }
	                 break;
	             default:
	                 System.out.println("Invalid choice");

	         }
	         System.out.println();
	         System.out.println("Thank You for booking!!");
	               
	     }
	 
	}



