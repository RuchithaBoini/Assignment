package com.src;
import java.util.Scanner;
public class Duplicatechars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string:");
		String s1=s.nextLine();
		int count;
		char string[]=s1.toCharArray();
		System.out.println("Duplicate chars are as follows:");
		for(int i=0;i<string.length;i++) {
			count=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j]&&string[i]!='0'){
					count++;
				string[i]='0';
					
				}
			}
			if(count>1&&string[i]!='0')
			 System.out.println(string[i]);
					
				}
			}
}
		
		
	


