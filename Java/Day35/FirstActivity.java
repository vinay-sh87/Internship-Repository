package com.app;
import java.util.*;

public class FirstActivity{
	public static void main(String args[]) throws Exception{
		Collection c = new HashSet();
		c.add("first");
		c.add("second");
		c.add("third");
		c.add("fourth");
		c.add("fifth");
		// iterator -- iterate over every element
		Iterator itr = c.iterator();
		while(itr.hassNext()){
			System.out.println(itr.next());
			Thread.sleep(1000);
		}
		// remove -- to remove an object
		c.remove("first");
		System.out.println("size: "+c.size());

	}
}