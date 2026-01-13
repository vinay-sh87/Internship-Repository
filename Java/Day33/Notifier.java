package com.app;

import java.util.*;

public class Notifier implements Runnable{
	Message message;
	public Notifier(Message message){
		this.message = message;
	}
	public void run(){
		try{
			synchronized(message){
				System.out.println("Notifier thread entry time " +new Date());
				System.out.println("Notification will be called after 5 seconds " +new Date());
				Thread.sleep(5000);
				System.out.println("Notification fired..."+ new Date());
				message.notify(); // thread will use the resource again after the notify is called
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());		
		}
	}
}