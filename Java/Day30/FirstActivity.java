package com.app;
import java.util.*;

// in the life cycle of thread only once the thread can be started

class MyThread extends Thread{
	public void run(){
		// running state
		for(int i=1;i<=10;i++){
			if(i==5){
				Scanner sc = new Scanner(System.in);	
				System.out.println("Enter your name");
				String name = sc.nextLine(); // blocked state --> runnable state
				System.out.println("Your name : "+name); // running state
			}
			System.out.println( i + " Current Thread : "+Thread.currentThread().getName());
		}
	}
} // dead or terminated state

public class FirstActivity{
	public static void main(String args[]){
		MyThread t = new MyThread(); // new born state 
		t.start(); // ready to run state 
	
	}
}