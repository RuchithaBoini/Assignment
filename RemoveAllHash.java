package com.src;

import java.util.HashSet;

public class RemoveAllHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hash=new HashSet<String>();
		hash.add("Internet");
		hash.add("Computers");
		hash.add("Lapptops");
		hash.add("Mobiles");
		hash.add("Bluetooth");
		hash.add("Airpods");
		hash.add("Adaptors");
		System.out.println("\nHashSet contains:"+hash);
		hash.clear();
		System.out.println("Remove of all HashSet will be:"+hash);
		

	}

}
