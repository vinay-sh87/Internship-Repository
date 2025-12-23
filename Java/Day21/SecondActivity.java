package com.app;
import java.util.*;

// can try be possible without catch ?
// Yes, but in this case finally block is mandatory...

public class SecondActivity{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numerator = 23;
		System.out.println("Enter denominator");
		int deno = sc.nextInt();
		try{
			int result = numerator/deno;
			System.out.println("Result "+result);
		}finally{
			System.out.println("Finally block executed...");
		}
	}
}