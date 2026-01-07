package com.app;

// join() --> assures that the second thread only be excuted after finishing the first thread....

class MyTask implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("i " +i+" current thread name: "+Thread.currentThread().getName());
		}
	}
}
public class SecondActivity{
	public static void main(String args[])throws Exception{
		MyTask task = new MyTask();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.setName("India");
		t2.setName("Japan");
		t1.start();
		t1.join();
		t2.start();
	}
}