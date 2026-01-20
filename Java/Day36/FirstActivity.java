package com.app;
import java.util.*;

public class FirstActivity{
	public static void main(String args[]) throws Exception{
		List list = new ArrayList();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		ListIterator litr = list.listIterator();
		System.out.println("Forward traversing");
		while(litr.hasNext()){
			System.out.println(litr.next());		
			Thread.sleep(1000);
		}
		System.out.println("Backward traversing");
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
			Thread.sleep(1000);
		}
		System.out.println("Elements in the list : "+list);
		list.remove("third");
		System.out.println("Elements in the list : "+list);
		list.set(1,"two");
		System.out.println("Elements in the list : "+list);

	}
}