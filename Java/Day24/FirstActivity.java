package com.app;	
import java.io.*;


public class FirstActivity{
	public static void main(String args[]){
		try{
			InputStream ins = new FileInputStream("FirstActivity.java");
			int ascii = ins.read();
			System.out.println(ascii);
			
			int ch = 0;
			while((ch=ins.read())!=-1){
				System.out.print((char)ch);
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}

		
	}
}