package com.src;

import java.util.HashSet;

public class Compare2Hashsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("ram");
		hs1.add("nam");
		hs1.add("kam");
		System.out.println("HashSet1:"+hs1);
		HashSet<String> hs2=new HashSet<String>();
		hs2.add("ram");
		hs2.add("nam");
		hs2.add("kam");
		hs2.add("dam");
		System.out.println("HashSet2:"+hs2);
		
		boolean value=hs1.equals(hs2);
		System.out.println("Are both value equal:"+value);

	}

}
