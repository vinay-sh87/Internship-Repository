// Overriding : Redefining the method of super class into its subclass ika overriding
// final methods can not be overridden
// static methods do not follow the principal of overriding

class First{
	void sayHello(){
		System.out.println("Hello....A");
	}
	// can not be overridden into the child class 
	final void sayHi(){
		System.out.println("Hii...A");
	}
	// static does not follows the principal
	static void sayNothing(){
		System.out.println("Nothing");
	}
	

}
class Second extends First{
	void sayHello(){
		System.out.println("Hello...B");
	}
	static void sayNothing(){
		System.out.println("Nothing...B");
	}

}
public class SecondActivity{
	public static void main(String args[]){
		First obj = new Second();
		obj.sayHello();
	}
}
