package com.app;
import java.util.*;

public class ThirdActivity{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numerator = 23;
		System.out.println("Enter the denominator ");
		int deno = sc.nextInt();
		try{
			int result = numerator / deno;
			System.out.println("The result of division " +result);
		}catch(ArithmeticException e){
			System.out.println("Division by zero is impossible");
		}
		int result_add = numerator+deno;
		System.out.println("The result of sum "+result_add);
	}
}