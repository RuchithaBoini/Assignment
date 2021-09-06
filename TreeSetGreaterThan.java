package com.src;

import java.util.TreeSet;

public class TreeSetGreaterThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(2);
		ts.add(12);
		ts.add(86);
		ts.add(37);
		ts.add(25);
		ts.add(27);
		ts.add(20);
		ts.add(99);
		ts.add(7);
		ts.add(29);
		System.out.println("Greater than 2:"+ts.higher(2));
		System.out.println("Greater than 99:"+ts.higher(99));

	}

}
