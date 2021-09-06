package com.src;
import java.util.Scanner;
public class Reversestring {
	void reverse(String s)
	{
		if((s==null)||(s.length()<=1)) {
		System.out.println(s);	
		}else
		{
			System.out.println(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1));
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.nextLine();
		Reversestring rs=new Reversestring();
		rs.reverse(s);
	}

}
