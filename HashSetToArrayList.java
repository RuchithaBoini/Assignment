package com.src;
/*
 * @author
 * 
 **/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class HashSetToArrayList {
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("ram");
		hs.add("seeta");
		hs.add("hanuma");
		hs.add("lakshman");
		System.out.println("HashSet contains:"+hs);
		String[] array=new String[hs.size()];
		hs.toArray(array);
		System.out.println("ArrayList contains:");
		for(String temp:array) {
			System.out.println(temp);
		}
	}

}
