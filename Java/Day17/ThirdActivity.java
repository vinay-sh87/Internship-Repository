// Property of polymorphism through method overloading

class Room{
	int calculateArea(int length){
		return length*length;
	}
	int calculateArea(int length, int breadth){
		return length*breadth;
	}
	double calculateArea(float radius){
		return Math.PI*radius*radius;
	}
}
public class ThirdActivity{
	public static void main(String args[]){
		Room obj = new Room();
		System.out.println("Area = "+obj.calculateArea(23));
		System.out.println("Area = "+obj.calculateArea(2,3));
		System.out.println("Area = "+obj.calculateArea(23.2F));
	}
}
