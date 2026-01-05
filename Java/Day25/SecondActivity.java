package com.app;
import java.io.*;

public class SecondActivity{
	public static void main(String args[]) throws IOException, InterruptedException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("source.txt"));
		System.out.println("Is the current stream supporting the mark facility: "+bis.markSupported());
		
		System.out.println((char)bis.read());
		Thread.sleep(1000);
		System.out.println((char)bis.read());
		Thread.sleep(1000);
		System.out.println((char)bis.read());
		Thread.sleep(1000);
		System.out.println((char)bis.read());
		Thread.sleep(1000);
		
		System.out.println("Applying the mark here");
		Thread.sleep(1000);
		bis.mark(10); // 10 is the readlimit here
		
		System.out.println((char)bis.read());
		Thread.sleep(1000);
		System.out.println((char)bis.read());
		Thread.sleep(1000);
		System.out.println((char)bis.read());
		Thread.sleep(1000);
		System.out.println((char)bis.read());
		Thread.sleep(1000);
		
		System.out.println("Applying the reset here");
		Thread.sleep(1000);
		bis.reset();
		
		System.out.println((char)bis.read());
		Thread.sleep(1000);
		System.out.println((char)bis.read());
		Thread.sleep(1000);
		System.out.println((char)bis.read());
		Thread.sleep(1000);
		System.out.println((char)bis.read());
		Thread.sleep(1000);
		
		bis.close();
	}
}

