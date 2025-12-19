package com.app;

class Room{
	int length = 23;
	void sayHello(){
		System.out.println("Hello...Room");
	}
	class Chamber{
		Chamber(){
			System.out.println("Chamber constructor");
		}
	}
}