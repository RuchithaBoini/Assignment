package com.src;

import java.util.SortedMap;
import java.util.TreeMap;

public class RangeOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <Integer,String>tm=new TreeMap<Integer,String>();
		SortedMap <Integer,String>sm=new TreeMap<Integer,String>();
		tm.put(214,"ruchi");
		tm.put(215,"ruhi");
		tm.put(216,"rachi");
		tm.put(217,"rasi");
		tm.put(218,"ruhina");
		tm.put(219,"rami");
		tm.put(220,"raimna");
		System.out.println(tm);
		sm=tm.subMap(214, 218);
		System.out.println("Submap key values :"+sm);
	

	}

}
