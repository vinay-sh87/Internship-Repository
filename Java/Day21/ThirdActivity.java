package com.app;
import java.util.*;

// Unchecked Exception -- not checked by the compiler

public class ThirdActivity{
	public static void main(String args[]){
		int numerator = 34;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int deno = sc.nextInt();
		int result = numerator/deno;
		System.out.println("Result "+result);
	}
}