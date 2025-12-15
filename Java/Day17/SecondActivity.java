// Polymorphism : change in the nature of intput -------> change in the nature of output
// acheived by overloading

class Room{
	int length;
	int breadth;
	Room(int l){
		length = l;
		breadth = l;
	}
	Room(int l, int b){
		length = l;
		breadth = b;
	}
	int calculateArea(){
		return length*breadth;
	}
}
public class SecondActivity{
	public static void main(String args[]){
		Room obj = new Room(12, 13);
		System.out.println("Area = "+obj.calculateArea());
	}
}