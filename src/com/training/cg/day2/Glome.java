package com.training.cg.day2;

public class Glome  extends Sphere implements Volume{

	Glome(double r, String n){
		this.Name=n;
		this.radius=r;
		
	}
	@Override
	public double getVolume() {
		
		return (Math.PI*0.5*radius*radius*radius);
	}


}
