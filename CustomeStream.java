package com.src;

import java.util.ArrayList;
import java.util.function.IntConsumer;
import java.util.stream.Stream;

public class CustomeStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> al=new ArrayList<Customer>();
		al.add(new Customer(12,"ruchi",6500));
		al.add(new Customer(9,"ruhi",4500));
		al.add(new Customer(42,"sanju",2212));
		al.add(new Customer(34,"kamya",7900));
		al.add(new Customer(56,"ramya",5000));
		Stream s=al.stream();
		IntConsumer c=((o)->
		{
			int max=5000;
			if(max<o)
			{
				max=o;
			}
			System.out.println("Highest Price : "+max);
			highest(max);
			
		});
		c.accept(Customer.getGiftprice());
				
		long high=s.filter((o)->((Customer)o).getGiftprice()>5000).count();
		
		System.out.print("\nCount of Customer who bought more than 5000 rupees : "+high);


	}

	private static  void highest(int max) {
		// TODO Auto-generated method stub
		
		
		if(Customer.getGiftprice()==max)
		{
			System.out.println("Customer Eligible for a Gift is : ");
			System.out.print("Customer Name : "+Customer.getName());
			System.out.print(" Customer Id : "+Customer.getId());
			
		}
		

	}

}
