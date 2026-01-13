package com.app;

// 2. using synchronized block 

class PrintSeries{
	void printSeries(){
		for(int i=1;i<=10;i++){
			System.out.println("i : "+i+" current thread name "+Thread.currentThread().getName());
		}
	}
}
class MyTask implements Runnable{
	PrintSeries series;
	public MyTask(PrintSeries series){
		this.series = series;
	}
	public void run(){
		synchronized(series){
			series.printSeries();
		}
	}
}
public class SecondActivity{
	public static void main(String args[]){
		PrintSeries series = new PrintSeries();
		MyTask task = new MyTask(series);	
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.setName("India");
		t2.setName("China");
		t1.start();
		t2.start();
	}
} 