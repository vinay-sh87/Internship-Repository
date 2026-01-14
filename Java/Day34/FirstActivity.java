package com.app;

class Room{
	int length;
	public Room(int length){
		this.length = length;
	}
	public String toString(){
		return "(Object of Room with length " + length+")";
	}
}
public class FirstActivity{
	public static void main(String args[]){
		Room obj = new Room(10);
		System.out.println(obj);
	}
}