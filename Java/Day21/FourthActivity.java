package com.app;
import java.io.*;

// Checked Error -- Checked by the compiler

public class FourthActivity{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String name = br.readLine();
		System.out.println("Name : "+name);
	}
}