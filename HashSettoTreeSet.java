package com.src;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSettoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Lucky");
		hs.add("Lucy");
		hs.add("Lara");
		hs.add("Lyra");
		hs.add("Lolo");
		
		System.out.println("HashSet contains:"+hs);
		
		Set<String> ts=new TreeSet<String>(hs);
		System.out.println("TreeSet contains:"+ts);
		for(String temp:ts) {
			System.out.println(temp);
		}
		
	}

}
