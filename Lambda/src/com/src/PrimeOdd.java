package com.src;

import java.util.function.IntConsumer;

public class PrimeOdd {

	public static void main(String[] args) {
		IntConsumer c=(o1)->
		{
			int flag=0;
			int m=0;
			m=o1/2;
			for(int i=2;i<m;i++) {
				if(i%o1==0) {
					System.out.println("Composite");
					flag=1;
					break;
				}
			}
		//	c.accept(12);
			if(flag==0) {
				System.out.println(o1+"is prime");
			}
			
			int i,fact=1;
			for(i=1;i<=o1;i++) {
				fact=fact*i;
			}
			System.out.println("Factorial of"+o1+"is"+fact);
			
			int sum=0,originalnum,reversenum;
			originalnum=o1;
			while(o1>0) {
				reversenum=o1%10;
				sum=(sum*10)+reversenum;
				o1=o1/10;
			}
			if(originalnum==sum) {
				System.out.println(originalnum+"palindrome");
			}else {
					System.out.println(originalnum+"not a palindrome");
					}
			};
			c.accept(2);

	}

}
