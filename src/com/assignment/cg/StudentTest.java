package com.assignment.cg;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentTest {
	
	public static void main(String[] args) {
		Student s1 = new Student("AB001","AKANSHA","ELECTRONICS","FOURTH","A COLONY");
		Student s2 = new Student("AB002","BUNNY","IT","THIRD","xyz city");
		Student s3 = new Student("AB002","BUNNY","IT","THIRD","xyz city");
		boolean check= s1.isEqual(s2);
		
		System.out.println("are both student record same: "+s1.isEqual(s2));
		System.out.println("are both student record same: "+s2.isEqual(s3));
		if(!check) {
			Set<Student> a = new LinkedHashSet <Student>();
			a.add(s1);
			a.add(s2);
			
			System.out.println("The Details of different students are.........");
			for(Student x:a) {
				System.out.println();
				System.out.println("Name: "+ x.studName);
				System.out.println("Id: "+ x.studId);
				System.out.println("Department: "+x.studDept);
				System.out.println("Year of Study: "+x.studyear);
				System.out.println("Address:"+x.studAddress);
				System.out.println();
			}
		}
		else {
			System.out.println("Two students can't have same Id");
		}
	}
		
	}
	
	



