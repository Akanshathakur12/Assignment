package com.training.cg.day2;

public class Cylinder extends Circle implements Volume{
	
	
	
	double height;
	Cylinder(double h,double r, String n){
		
		this.height=h;
		this.radius=r;
		this.Name=n;
	}
	@Override
	public double getVolume() {
		return (Math.PI*radius*radius*height);
		
		
	}

}
