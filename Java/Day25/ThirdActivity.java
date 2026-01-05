package com.app;
import java.util.*;

public class ThirdActivity{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = sc.nextLine().toUpperCase();
		System.out.println("Enter the second string: ");
		String str2 = sc.nextLine().toUpperCase();
		
		String sortedString1 = "",sortedString2="";
		if(str1.length() == str2.length()){
			for(int i=65;i<=90;i++){
				for(int j=0;j<str1.length();j++){
					char ch1 = str1.charAt(j);
					char ch2 = str2.charAt(j);
					if(i == ((int)ch1)){
						sortedString1 += ch1;
					}
					if(i == ((int)ch2)){
						sortedString2 += ch2;
					}
				}
			}
			System.out.println("Sorted String1 : "+sortedString1);
			System.out.println("Sorted String2 : "+sortedString2);
			if(sortedString1.equals(sortedString2)){
				System.out.println("Anagram words");
			}
		}else{
			System.out.println("Not anagram words");
		}
	}
}