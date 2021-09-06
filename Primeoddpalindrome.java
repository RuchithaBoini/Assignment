package com.src;

import java.util.function.IntPredicate;

public class Primeoddpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Odd program
		IntPredicate isOdd=(o1)->
		{
				if(o1%2==1) {
					System.out.println("Odd");//true
					return true;
				}
				else
					System.out.println("Even");//false
				return false;
		};
		boolean odd=isOdd.test(14);
		odd=isOdd.test(13);
		
		
		
		//Palindrome program
		IntPredicate ispalindrome=(o1)->{
			Integer n=(Integer)o1;
			int sum=0;
			int temp=n;
			while(n>0) {
				int rem=n%10;
				sum=(sum*10)+rem;
				n=n/10;
			}
			if(sum==temp) {
				System.out.println("palindrome");
				return true;
			}
			else 
				System.out.println("not a palindrome");
				return false;
		};
		boolean palin=ispalindrome.test(898);

		
		
		//Prime program
		IntPredicate isprime=(o1)->{
			int flag=0;
			for(int i=2;i<o1/2;i++) {
				if(i%o1==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("Prime");
				return true;
			}
				else 
					System.out.println("Composite");
					return false;
			};
			boolean prime=isprime.test(25);
			
			
		
	}
}
	
