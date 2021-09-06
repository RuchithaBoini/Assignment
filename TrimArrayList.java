package com.src;

import java.util.ArrayList;

public class TrimArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>(50);
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(8);
		al.add(10);
		al.add(12);
		al.add(14);
		al.add(16);
		al.trimToSize();
		System.out.println(al);
	}

}
