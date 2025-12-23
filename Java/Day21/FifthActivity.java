package com.app;
import java.io.*;

class A(){
	void inputByUser() throws IOExceoption{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");	
		String name = br.readLine();		
		System.out.println("Name : "+name);
	}
}