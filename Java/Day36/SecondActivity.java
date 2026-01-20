package com.app;
import java.util.*;

// Autoboxing vs Unboxing

public class SecondActivity{
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2); // list.add(new Integer(2)) : conversion from Primitive type into object oriented type is known as Autoboxsing
		list.add(3);
		int a = list.get(1); // conversion from object oriented type into primitive type is known as Unboxing
		System.out.println("a " +a);
	}
} 