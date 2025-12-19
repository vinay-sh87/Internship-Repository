package com.app;

// default members can only be accessed with in the same package...

public class ThirdActivity{
	public static void main(String args[]){
		Room obj = new Room();
		System.out.println("Length="+obj.length);
		obj.sayHello();
		Room.Chamber obj_chamber = new Room().new Chamber();
	}
}