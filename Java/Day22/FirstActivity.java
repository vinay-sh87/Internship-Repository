package com.app;

abstract class Room{
	public abstract int calculateArea(int length, int width);
	public abstract int calculateVolume(int length, int width, int height);
}
class Test extends Room{
	public int calculateArea(int length, int width){
		return length*width;
	}
	public int calculateVolume(int length, int width, int height){
		return length*width*height;
	}
}
public class FirstActivity{
	public static void main(String args[]){
		Room obj = new Test();
		System.out.println("Area = "+obj.calculateArea(23,23));
		System.out.println("Volume = "+obj.calculateVolume(23,2,3));
	}
}