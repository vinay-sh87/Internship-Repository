package com.app;
import java.io.*;

// used for selective reading
// int read(byte[] buffer, int startIndex, int numberOfCharacters we want to read) 

public class ThirdActivity{
	public static void main(String args[]){
		try{
			InputStream ins = new FileInputStream("source.txt");
			byte[] buffer = new byte[10];
			int noc = ins.read(buffer,2,5);
			System.out.println("No of characters " +noc);
			for(int i=0;i<buffer.length;i++){
				System.out.println(i+" ---------> "+buffer[i]);
			}
			ins.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}