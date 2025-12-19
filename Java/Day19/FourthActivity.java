package com.app;

class Room{
	class Chamber{
		Chamber(){
			System.out.println("Chamber constructor");
		}
	}
}
public class FourthActivity{
	public static void main(String args[]){
		Room.Chamber obj_chamber = new Room().new Chamber();
	}
}