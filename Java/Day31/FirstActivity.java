package com.app;

// don't rely on thread priority because thread scheduling priority is not garanteed --> use thread priority to improve the performace of the applications

// By default the priority of any thread : 5 Thread.NORM_PRIORITY
// Minimum --> 0 Thread.MIN_PRIORITY
// Maximum --> 10 Thread.MAX_PRIORITY

class Task implements Runnable{
	public void run(){
		for(int i=1;i<=1000;i++){	
			System.out.println("i " +i +" current thread : " +Thread.currentThread());
		}
	}
}

public class FirstActivity{
	public static void main(String args[]){
		Task t = new Task();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.setName("India");
		t2.setName("Japan");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	
	}
}