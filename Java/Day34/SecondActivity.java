package com.app;
import java.util.*;

public class SecondActivity{
	public static void main(String args[]){
		Collection c = new HashSet();
		c.add("First");
		c.add("Second");
		c.add("Third");
		c.add("Fourth");
		System.out.println("Elements in the collection " +c);
		c.clear();
		System.out.println("Elements in the collection " +c);
		System.out.println("Is Fifth in the collection "+c.contains("Fifth"));
		System.out.println("Is collection empty "+c.isEmpty());
	}
}