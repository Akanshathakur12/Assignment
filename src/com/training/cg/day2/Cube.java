package com.training.cg.day2;

public class Cube extends Square implements Volume{
	Cube(double s, String n){
		this.Name=n;
		this.side=s;
	}

	@Override
	public double getVolume() {
		
		return side*side*side;
	}

}
