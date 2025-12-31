package com.app;
// 9044060474

abstract class Question{
	public abstract boolean isNiven(int num);
	public abstract boolean isPrime(int num);
}

class Solution extends Question{
	public boolean isNiven(int num){
		int temp = num;
		int sum = 0;	
		while(temp>0){
			int rem = temp % 10;
			sum += rem;
			temp /=10;
		}
		 return num % sum == 0;
	}
	public boolean isPrime(int num){
		boolean flag = true;
		for(int i=2;i<num;i++){
			if(num%i == 0){
				flag = false;
				break;
			}
		}
		return flag;
	}
}

public class FirstActivity{
	public static void main(String args[]){
		Question obj = new Solution();
		System.out.println("Niven "+ obj.isNiven(234));
		System.out.println("Is Prime "+obj.isPrime(5));
		
	}
}