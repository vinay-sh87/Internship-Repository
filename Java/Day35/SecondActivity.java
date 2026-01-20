package com.app;
import java.util.*;

public class SecondActivity{
	public static void main(String args[]){
		List list = new ArrayList();	
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("first");
		list.add("fifth");
		for(int i=0;i<list.size();i++){
			System.out.println(i+" ---> "+list.get(i));
		}
		System.out.println("First occurance of the element : "+list.indexOf("first"));
		System.out.println("Last occurance of the element : "+list.lastIndexOf("first"));
	}
}