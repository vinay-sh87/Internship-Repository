package com.app;

// creating user defined thread : inheriting the Thread class 

class Test extends Thread{
	public void run(){
		for(int i =0;i<=10;i++){
			System.out.println("i "+i+" thread name : "+Thread.currentThread().getName());
		}
	}
}
public class SecondActivity{
	public static void main(String args[]){
		Test obj = new Test();
		obj.setName("threadn"); // to set the thread name
		obj.start(); // start provokes the execution as a seperate thread
		// obj.run(); // same thread : main
	}
}