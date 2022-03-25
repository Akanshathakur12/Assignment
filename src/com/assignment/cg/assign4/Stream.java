package com.assignment.cg.assign4;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Stream {

			@SuppressWarnings("resource")
			public static void main(String[] args) {
				 System.out.println("Enter the range for which you want to calculate the average");
				 
			        Scanner sc = new Scanner(System.in);
			 
			        int num = sc.nextInt();
			 
			        int[] arr = new int[num];
			 
			       
			        for (int i = 0; i < num; i++) {
			            System.out.println("Enter number " + (i + 1) + ":");
			            arr[i] = sc.nextInt();
			        }
			 
			        IntStream streamOfNumbers = Arrays.stream(arr);
			 
			        OptionalDouble averageOfNumbers = streamOfNumbers.average();
			 
			        System.out.println("Average of Numbers: " + averageOfNumbers);
			 
			
	}

}
