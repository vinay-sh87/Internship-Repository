// Can a constructor be declared as 'private'?
// constructor can be declared as private but in this case object of given class can be declared with the same class only

package com.app;

class Room{
	private Room(){
		System.out.println("Constructor of Room");
	}
	public static void main(String args[]){
		Room obj = new Room();
	}
}
public class SecondActivity{
}