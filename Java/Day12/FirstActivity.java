class Room{
	int length;
	Room(){
		length = 12;
	}
}

public class FirstActivity{
	public static void main(String args[]){
		Room r = new Room();
		System.out.println("Length = "+r.length);
	}
}