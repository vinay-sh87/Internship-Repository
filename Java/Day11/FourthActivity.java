class Room{
	static int length = 12;
	Room(){
		System.out.println("Length = " +this.length);
		length++;
	}
}
public class FourthActivity{
	public static void main(String args[]){
		Room obj = new Room();
		Room obj1 = new Room();
		Room obj2 = new Room();
		Room obj3 = new Room();
	}
}