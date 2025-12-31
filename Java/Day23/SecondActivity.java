package com.app;

abstract class ShapeSphere{
	public abstract double calculateAreaSphere(int num);
	public abstract double calculateAreaCircle(int num);
}

class Area extends ShapeSphere{
	public double calculateAreaSphere(int num){
		return 4*Math.PI*num*num;
	}
	public double calculateAreaCircle(int num){
		return Math.PI*num*num;
	}
}

public class SecondActivity{
	public static void main(String args[]){
		ShapeSphere obj = new Area();
		System.out.println("Sphere Area "+obj.calculateAreaSphere(2));
		System.out.println("Circle Area "+obj.calculateAreaCircle(2));
		
	}
}