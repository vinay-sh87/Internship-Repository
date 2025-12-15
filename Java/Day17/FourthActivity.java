// this() :Refers to the constructor in the same class

class Room{
	int length;
	int breadth;
	Room(){
		this(11,33);
	}
	Room(int l, int b){
		length = l;
		breadth = b;
	}
	int calculateArea(){
		return length*breadth;
	}
}
public class FourthActivity{
	public static void main(String args[]){
		Room obj = new Room();
		System.out.println("Area =" + obj.calculateArea());
	}
}
