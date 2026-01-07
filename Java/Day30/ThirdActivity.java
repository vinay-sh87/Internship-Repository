package com.app;

class Task implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
			if(i%4==0){
				System.out.println(Thread.currentThread().getName() + " is going to yield");
				Thread.yield();
			}
			System.out.println("i " +i+" current thread name : "+Thread.currentThread().getName());
		}
	}
}
public class ThirdActivity{
	public static void main(String args[]){
		Task t = new Task();
		Thread t1 = new Thread(t);
		t1.setName("India");
		Thread t2 = new Thread(t);
		t2.setName("Japan");
		t1.start();
		t2.start();
	}
}