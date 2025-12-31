package com.app;

// interfaces offer 100% abstraction

interface Iface{
	public abstract void sayHello();
	void sayHii(); // public abstract is implicit here 
	// >=1.8
	static void imStatic(){
		System.out.println("I am static");	
	}
	// >=1.8
	default void imDefault(){
		System.out.println("I am default");
	}
}
class Test implements Iface{
	public void sayHello(){
		System.out.println("Hello...");
	}
	public void sayHii(){
		System.out.println("Hii...");
	}
}

public class ThirdActivity{
	public static void main(String args[]){
		Iface obj = new Test();
		obj.sayHello();
		obj.sayHii();
		
		Iface.imStatic();
		obj.imDefault();
	}
}