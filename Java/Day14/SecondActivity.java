class Room{
	private int length = 23;
	int getLength(){
		return length;
	}
}
public class SecondActivity{
	public static void main(String args[]){
		Room obj = new Room();
		System.out.println("Length = " + obj.getLength());
	}
}