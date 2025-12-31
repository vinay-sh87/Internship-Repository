package com.app;
import java.io.*;

// reads the source and fills the byte array with the ascii of characters
// returns the number of characters read at a time

public class SecondActivity{
	public static void main(String args[]){
		try{
			InputStream ins = new FileInputStream("source.txt");
			byte[] buffer = new byte[30];
			int noc = ins.read(buffer); // reads the characters from the source and fills inside the buffer array and returns the number of characters read at a time in the noc 
			System.out.println("No of characters read at a time: "+noc);
			for(byte b:buffer){	
				System.out.print((char)b);
			}
		}catch(IOException e){
			System.out.println("Reason for the error : "+e.getMessage());
		}
	}
}