package com.training.cg.day2;

public class Sphere extends Circle implements Volume {
	Sphere(){
		
	}
	Sphere(double r,String n){
		this.Name=n;
		this.radius=r;
	}

	@Override
	public double getVolume() {
		
		return (4/3)*Math.PI*radius*radius*radius;
	}

}
