import java.util.*;
class Prime{
	
	boolean isPrime(int number){
		boolean flag = false;
		for(int i=2;i<number;i++){
			if(number % 2 == 0){
				flag = true;
				break;
			}
		}
		return flag;
	}
}
public class FourthActivity{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		Prime p = new Prime();
		if(p.isPrime(num)){
			System.out.println(num + " is not a Prime Number");
		}else{
			System.out.println(num + " is a Prime Number");
		}
	}
}
		
		