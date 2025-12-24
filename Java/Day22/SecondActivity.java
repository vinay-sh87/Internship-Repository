package com.app;

abstract class Room{
	public abstract int calculateArea(int length, int width);
	public void sayHello(){
		System.out.println("Hello...");		
	}
}
public class SecondActivity{
	public static void main(String args[]){
		Room obj = new Room(){
			public int calculateArea(int length, int width){
				return length*width;
			}
		};
		System.out.println("Area = "+obj.calculateArea(2,3));
		obj.sayHello();
	}
}