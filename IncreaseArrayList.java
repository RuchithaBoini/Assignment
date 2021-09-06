package com.src;

import java.util.ArrayList;

public class IncreaseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>(4);
		al.add("Pizza");
		al.add("Sandwich");
		al.add("Burger");
		al.add("Milkshake");
		System.out.println("Arraylist :"+al);
		al.ensureCapacity(3);
		al.add("Thickshake");
		al.add("Chips");
		al.add("FrenchFries");
		System.out.println("Increased list:"+al);
}

}
