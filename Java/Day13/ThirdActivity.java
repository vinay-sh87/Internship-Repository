import java.util.*;

class A{
	boolean isPalindrome(int number){
		int temp = number;
		int reverse = 0;
		while(temp > 0){
			int rem = temp % 10;
			reverse = reverse*10 + rem;
			temp = temp/10;
		}
		if(reverse == number) {
			return true;
		}else{
			return false;
		}
	}
}
public class ThirdActivity{
	public static void main(String args[]){
		A obj = new A();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int value = sc.nextInt();
		if(obj.isPalindrome(value)){
			System.out.println(value +" is a palindrome number");
		}else{
			System.out.println(value + " is not a palindrome number");
		}
	}
}