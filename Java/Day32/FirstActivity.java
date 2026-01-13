package com.app;

// the process of synchronization assures that only one thread is allowed on given resources at a time
// 1. using synchronized modifier

class PrintTable{
	// synchronized modifier
	synchronized void printValues(){
		for(int i=2;i<=20;i+=2){
			System.out.println("i = "+i+" current thread name :" +Thread.currentThread().getName());
		}
	}
}
class MyTask implements Runnable{
	PrintTable table;
	public MyTask(PrintTable table){
		this.table = table;
	}
	public void run(){
		table.printValues();
	}
}

public class FirstActivity{
	public static void main(String args[]){
	PrintTable table = new PrintTable();
	MyTask task = new MyTask(table);
	Thread t1 = new Thread(task);
	Thread t2 = new Thread(task);	
	t1.setName("India");
	t2.setName("China");	
	t1.start();
	t2.start();
		
	}
}