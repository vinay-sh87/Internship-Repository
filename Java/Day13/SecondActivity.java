import java.util.*;

class A{
	boolean checkNiven(int number){
		int temp = number;
		int sum = 0;
		while(temp > 0){
			int rem = temp % 10;
			sum += rem;
			temp /= 10;
		}
		if(number % sum == 0){
			return true;
		}else{
			return false;
		}
	}
}

public class SecondActivity{
	public static void main(String args[]){
		A obj = new A();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");	
		int value = sc.nextInt();
		if(obj.checkNiven(value)){
			System.out.println("Niven");
		}else{
			System.out.println("Not a niven");
		}
		
	}
}