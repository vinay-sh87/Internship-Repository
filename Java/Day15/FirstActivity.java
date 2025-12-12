class A{
	int length = 33;
	void sayHello(){
		System.out.println("Hello...A");
	}
}
class B extends A{
	int breadth = 24;
	void sayHi(){
		System.out.println("Hi...B");
	}
}

public class FirstActivity{
    
    public static void main(String args[]){
        A obj = new B(); // parent class object can be intentiated through the child class obj but not the members of child class

	System.out.println("Length = " +obj.length);
	obj.sayHello();
	// obj.sayHi(); // error
    }
}