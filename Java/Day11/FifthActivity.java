class Room{
	int length;
	Room(int l){
		length = l;
	}
	/* default constructor
		Room(){
		}
	*/
}
public class FifthActivity{
	public static void main(String args[]){
		Room obj = new Room(23);
		System.out.println("Length ="+obj.length);

	}
}