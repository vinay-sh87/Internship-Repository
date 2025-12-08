class Car{
	int price;
	String name;
	String model;
	
	Car(int price, String name, String model){
		this.price = price;
		this.name = name;
		this.model = model;
	}
	void run(){
		System.out.println("Car is running");
	}
}

class Room{
	int length;
	int breadth;
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
		Car car = new Car(2000000,"BMW M4", "M4");
		System.out.println("Specifications : \nPrice = "+car.price+"\nName = "+car.name+"\nModel = "+car.model);
		car.run();

		System.out.println();
		Room r = new Room(12,33);
		System.out.println("Length = "+r.length);
		System.out.println("Breadth = "+r.breadth);
		System.out.println("Area = "+r.calculateArea());
		

	}
}