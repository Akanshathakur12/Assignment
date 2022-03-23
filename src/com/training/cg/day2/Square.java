package com.training.cg.day2;

public class Square extends Shape implements Area{
	
	double side;
	Square(){
		
	}
	Square(double S, String n){
		this.Name=n;
		this.side=S;
	}
	@Override
	public double getArea() {
		
		return (side*side);
	}

}
