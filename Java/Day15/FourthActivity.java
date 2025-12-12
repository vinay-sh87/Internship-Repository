class A{
	int length = 23;
}
class B extends A{
	int length = 33;
}
public class FourthActivity{
	public static void main(String args[]){
		A obj = new B();
		System.out.println("Length = "+obj.length);
	}
}