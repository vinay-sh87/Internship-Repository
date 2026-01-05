package com.app;
import java.io.*;

// Serialize : object state --> file

public class SerializeIt{
	public static void main(String args[]) throws Exception{
		Room obj = new Room(10,20);
		ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("test.ser"));
		ous.writeObject(obj);
		ous.close();
	}
}