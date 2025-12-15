class Room{
	int length;
	int breadth;
	Room(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}

	void printValues(){
		System.out.println("Length ="+length+" Width =" +breadth);
	}
}
public class FifthActivity{
	public static void main(String args[]){
		Room obj = new Room(19,23);
		obj.printValues();
	}
}
