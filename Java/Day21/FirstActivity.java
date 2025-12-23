package com.app;
import java.util.*;

public class FirstActivity{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numerator = 23;
		System.out.println("Enter denominator");
		int deno = sc.nextInt();
		try{
			int result = numerator/deno;
			System.out.println("Result "+result);
		}catch(ArithmeticException e){
			System.out.println("Catch block executed");	
			System.out.println("Division by zero is not possible");	
		}finally{
			System.out.println("Finally block executed...");
		}
	}
}