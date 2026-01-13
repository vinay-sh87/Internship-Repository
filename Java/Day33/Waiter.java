package com.app;

import java.util.*;

public class Waiter implements Runnable{
	Message message;
	public Waiter(Message message){
		this.message = message;
	}
	public void run(){
		try{
			synchronized(message){
				System.out.println("Waiter thread entry time " +new Date());
				System.out.println("I will call the wait after 5 seconds "+new Date());
				Thread.sleep(5000);
				System.out.println("Wait fired...."+new Date());			
				message.wait(); // thread will leave the resource after the wait is called
				System.out.println("Wait is over "+new Date());
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}