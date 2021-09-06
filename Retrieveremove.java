package com.src;

import java.util.TreeSet;

public class Retrieveremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		TreeSet<Integer>treeHeadset=new TreeSet<Integer>();
		
		ts.add(27);
		ts.add(12);
		ts.add(99);
		ts.add(20);
		ts.add(07);
		ts.add(0);
		ts.add(-12);
		ts.add(14);
		ts.add(75);
		
		System.out.println("TreeSet :"+ts);
		System.out.println("Retrieving of first (lowest) element :"+ts.pollFirst());
		System.out.println("TreeSet after retrieving first element:"+ts);
		System.out.println("Reteriving of second(lowest) element :"+ts.pollFirst());
		System.out.println("TreeSet after reterieving :"+ts);
		System.out.println("Reterieving of last(lowest) element :"+ts.pollLast());
		System.out.println("TreeSet after retereivng :"+ts);
	}

}
