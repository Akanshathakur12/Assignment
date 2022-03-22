package com.assignment.cg;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class EmployeeTest {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Set<Employee> set =new LinkedHashSet<>();
		set.add(e2);
		set.add(e1);
		
		Scanner sc= new Scanner(System.in);
		for(Employee x:set) {
			System.out.println("Enter employee id:");
			x.EmpId= sc.next();
			System.out.println("Enter employee name:");
			x.EmpName= sc.next();
			System.out.println("Enter employee departname:");
			x.EmpDept= sc.next();
			System.out.println("Enter employee phone number:");
			x.EmpPhone= sc.nextDouble();
			System.out.println("Enter employee base salary:");
			x.BaseSal= sc.nextDouble();
			}
		
		for(Employee y:set) {
			System.out.println("Details of the Employee are...........");
			System.out.println("EMPLOYEE ID: "+y.EmpId);
			System.out.println("EMPLOYEE NAME: "+y.EmpName);
			System.out.println("Employee department: "+y.EmpDept);
			System.out.println("PHONE NUMBER: "+y.EmpPhone);
		    System.out.println("Basic SALARY: "+y.BaseSal);
			System.out.println("PF:"+y.Calculate());
			double totalsalry= y.BaseSal+y.allowance()-y.Calculate();
			System.out.println("Total salary in-hand is: "+totalsalry);
			System.out.println();
		}
	}

}
