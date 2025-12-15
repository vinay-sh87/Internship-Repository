// there is an universal Object class in java 

class A{
	A(String name){
		// super();
		System.out.println("Constructor...A");
		System.out.println("Hello..."+name);
	}
}
class B extends A{
	B(){
		super("Vinay Sharma"); // refers to the constructor of the parent class 
		System.out.println("Constructor....B");
	}
}
public class FirstActivity{
	public static void main(String args[]){
		A obj = new B();
	}
}