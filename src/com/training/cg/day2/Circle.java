package com.training.cg.day2;

public class Circle extends Shape implements Area{
	
	double radius;
	
	Circle(double r, String n){
		this.Name= n;
		this.radius=r;
	}
Circle(){
		
	}


	@Override
	public double getArea() {
		return (Math.PI* radius*radius);


		
	}
	

}
