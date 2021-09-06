package com.src;

import java.util.Scanner;
import java.util.function.IntFunction;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		IntFunction f=(o1)->{
			int n1=0,n2=1,n3=0;
			if(o1==0) {
				return n1;
			}
			else if(o1==1) {
				return n2;
			}
			for(int i=2;i<=o1;i++) {
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
			return n3;
			
		};
		
		System.out.println(n+"Element of fibonacci series are:"+f);

	}

}
