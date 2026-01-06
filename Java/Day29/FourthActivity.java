package com.app;

public class FourthActivity{
	public static void main(String args[]){
		Runnable task = new Runnable(){
			public void run(){
				for(int i =1;i<=10;i++){
					System.out.println("i : "+i+" current thread : "+Thread.currentThread().getName());
				}
			}
		};
		Thread t1 = new Thread(task);
		t1.setName("India");
		Thread t2 = new Thread(task);
		t2.setName("Japan");
		t1.start();
		t2.start();	
		
	}
}