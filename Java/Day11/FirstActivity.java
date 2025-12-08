class Room{
	// instance variables
	int length; 
	int breadth;
	
	// constructor -- used to initailiza the first copy of the object in the memory
	Room(int l, int b){
		length = l;
		breadth = b;
	}
	
	// instance function
	int calculateArea(){
		return length * breadth;
	}
}

// real world entity -- new - used to initalize the obj (96 bits space)
// identity -- obj
// characteristics -- length, breadth
// bahaviour -- calculates area

public class FirstActivity{
	public static void main(String args[]){
		
		// object creation
		Room obj = new Room(10,20);
		System.out.println("Length = "+obj.length);
		System.out.println("Breadth = "+obj.breadth);
		System.out.println("Area = "+obj.calculateArea());

	}
}