package com.app;
import java.io.*;

// Deserialize : file ---> object state 

public class DeserializeIt{
	public static void main(String args[]) throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));
		Object o = ois.readObject();
		Room obj = (Room)o;
		
		System.out.println("Length : "+obj.length);
		System.out.println("Width : "+obj.breadth);
	}
}