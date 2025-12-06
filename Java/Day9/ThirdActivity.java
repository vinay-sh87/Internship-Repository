import java.util.*;

public class ThirdActivity{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		int temp = number;
		int sum = 0;
		
		while(temp>0){
			int rem = temp % 10;
			int n = rem*rem*rem;
			sum += n;
			temp /=10;
		}
		if(sum == number){
			System.out.println(number + " is a Armstrong Number");
		}else{	
			System.out.println(number + " is not a armstrong number");
		}
	}
}