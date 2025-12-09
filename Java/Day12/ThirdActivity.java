import java.util.*;

class A{
	long factorial(int num){
		long fact = 1;
		for(int i=1;i<=num;i++){
			fact *= i;
		}
		return fact;
	}
}

public class ThirdActivity{
	public static void main(String args[]){
		A obj = new A();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of factorial you want");
		int number = sc.nextInt();
		System.out.println("Factorial of " + number +" = "+obj.factorial(number));

	}
}