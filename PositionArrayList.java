package com.src;

import java.util.ArrayList;

public class PositionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("Rani");
		arraylist.add("Vani");
		arraylist.add("Mani");
		arraylist.add("Sani");
		arraylist.add("Pani");
		arraylist.add("are friends");
		System.out.println("\nArrayList:"+arraylist);
		System.out.println("\nprint using index of an element");
		int numelements=arraylist.size();
		for(int index=0;index<numelements;index++) {
			System.out.println(arraylist.get(index));
		}
		

	}

}
