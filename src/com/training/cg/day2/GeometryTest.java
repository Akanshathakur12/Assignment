package com.training.cg.day2;

import java.util.Scanner;

public class GeometryTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape:");
		String s= sc.next();
		
		if(s.equalsIgnoreCase("circle")) {
			
			System.out.println("Enter radius of circle in meters:");
			double radius=sc.nextDouble();
			Circle c= new Circle(radius,"shape");
			double ca=c.getArea();
			System.out.println("Area of the circle is: "+ca+"  sq mts");
			
		}
		else if(s.equalsIgnoreCase("square")) {
			System.out.println("Enter length of square in meters:");
			double side=sc.nextDouble();
			Square sq= new Square(side,"shape");
			double sqarea=sq.getArea();
			System.out.println("Area of the square is: "+sqarea+"  sq mts");
			
		}
		else if(s.equalsIgnoreCase("cylinder")) {
			System.out.println("Enter height and radius of cylinder in meters:");
			double height=sc.nextDouble();
			double radius=sc.nextDouble();
			Cylinder cy= new Cylinder(height,radius,"shape");
			double cyarea=cy.getVolume();
			System.out.println("volume of the cylinder is: "+cyarea+"  cu mts");
			
		}
		else if(s.equalsIgnoreCase("sphere")) {
			System.out.println("Enter radius of sphere in meters:");
			
			double radius=sc.nextDouble();
			Sphere sp= new Sphere(radius,"shape");
			double sparea=sp.getVolume();
			System.out.println("volume of the sphere is: "+sparea+"  cu mts");
			
		}
		else if(s.equalsIgnoreCase("cube")) {
			System.out.println("Enter length of side  of cube in meters:");
			
			double side=sc.nextDouble();
			Cube cu= new Cube(side,"shape");
			double cuarea=cu.getVolume();
			System.out.println("volume of the cube is: "+cuarea+"  cu mts");
			
		}
		else if(s.equalsIgnoreCase("glome")) {
			System.out.println("Enter radius of glome in meters:");
			
			double radius=sc.nextDouble();
			Glome gl= new Glome(radius,"shape");
			double glarea=gl.getVolume();
			System.out.println("volume of the sphere is: "+glarea+"  cu mts");
			
		}
		else {
			System.out.println("Entered name is not valid");
		}
	}

}
