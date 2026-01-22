package com.app;
import java.util.*;

class Room{
	int length;
	int width;
	Room(int length, int width){
		this.length = length;
		this.width = width;
	}
	public String toString(){
		return "Object with lenth :"+ this.length+" and with : "+this.width;
	}
}

class LengthWise implements Comparator<Room>{
	public int  compare(Room o1, Room o2){
		return o1.length - o2.length;
	}
}

class WidthWise implements Comparator<Room>{
	public int compare(Room o1, Room o2){
		return o1.width - o2.width;
	}
}
public class SecondActivity{
	public static void main(String args[]){
		SortedSet<Room> sset = new TreeSet<Roo
	}
}