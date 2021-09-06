package com.src;
import java.util.Scanner;
import java.util.TreeSet;

public class EvenOdd extends Thread {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n:");
		int n=s.nextInt();
		new Thread(()->{
			for(int i=0;i<=n;i+=2) {
				System.out.println("printing even:");
				System.out.println(i);}
			}).start();
			
			new Thread(()->{for(int i=1;i<=100;i+=2) {
				System.out.println("printing odd:");
				System.out.println(i);}
			}).start();
		

			
		}
	}


