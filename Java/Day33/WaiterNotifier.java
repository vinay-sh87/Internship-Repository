package com.app;

public class WaiterNotifier{
	public static void main(String args[]){
		Message message = new Message();
		Waiter waiter = new Waiter(message);
		Notifier notifier = new Notifier(message);
		Thread waiterTask = new Thread(waiter);
		Thread notifierTask = new Thread(notifier);
		waiterTask.start();
		notifierTask.start();
	}
}