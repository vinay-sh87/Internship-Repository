// static or class variable is stored as a single copy so this copy can be accessed through the class and obj 

class Room{
	// instance variable
	int length = 10;
	// static or class variable 
	static int breadth = 34;
}
public class ThirdActivity{
	public static void main(String args[]){
		Room obj = new Room();
		System.out.println("Length ="+obj.length);
		System.out.println("Through class name ="+Room.breadth);
		System.out.println("Through obj name =" +obj.breadth);
	}
}