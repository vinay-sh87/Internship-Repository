class A{
	int length;
	int calculateArea(int l, int b){ // Formal Parameter
		return l*b;
	}
}
public class SecondActivity{
	public static void main(String args[]){
		A obj = new A();

		System.out.println("Area = "+obj.calculateArea(23,234)); // Actual parameter
	}
}