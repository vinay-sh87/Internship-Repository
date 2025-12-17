package com.app;
import shape.circle.*;
import shape.rectangle.*;

public class SecondActivity{
	public static void main(String args[]){
		Circular obj = new Circular();
		System.out.println("Area of Sphere: "+obj.calculateAreaSphere(28));
		Rectangular obj2 = new Rectangular();
		System.out.println("Area of Rectangle: "+obj2.calculateAreaRectangle(10,20));

	}
}