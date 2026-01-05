package com.app;
import java.io.*;
// ins.available() --> no of characters
// ins.skip(n) --> skip n characters

public class FirstActivity{
	public static void main(String args[]) throws IOException {
		InputStream ins = new FileInputStream("source.txt");
		System.out.println("No of characters in the stream : "+ins.available());
		ins.skip(2); // skips two character
		System.out.println((char)ins.read());
	}
} 