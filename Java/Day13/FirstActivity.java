// Object creation = (1)class loads on JVM (static initialization when class loads) + (2)Constructor gets Executed

// Observation : static initialization block is executed only once in the whole life cycle of the servlet and constructor gets executed everytime the object is created...


class Room {
	Room(){
		System.out.println("Constructor executed..."); // everytime the object is created
		System.out.println("-------");

	}
	static {
		System.out.println("Static block executed..."); // only once in the whole life cycle
	}
	{
		System.out.println("Instance initialization block..."); // everytime the object is created
	}
}

public class FirstActivity{
	public static void main(String args[]){
		Room obj = new Room();
		Room obj1 = new Room();
		Room obj2 = new Room();
		Room obj3 = new Room();
		
	}
}