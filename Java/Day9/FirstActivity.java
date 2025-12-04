import java.util.*;

public class FirstActivity{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int value = scan.nextInt();
		boolean isPrime = true;
		for(int i=2;i<value;i++){
			if(value % i == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.println(value + " is a prime number ");
		}else{
			System.out.println(value + " is not a prime number");
		}

				
	}
}