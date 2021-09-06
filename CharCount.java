package com.src;
import java.util.Scanner;
public class CharCount {
	
	public static void main(String[] args) {
	
        String s;
		int i,length;
		int count[]=new int[256];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string:");
		s=scan.nextLine();
		length=s.length();
		
		for(i=0;i<length;i++) {
			count[(int)s.charAt(i)]++;
			
		}
		
		for(i=0;i<256;i++){
			if(count[i]!=0) {
				System.out.println( (char)i+" "+count[i]);
			}
		}

	}

}
