package com.src;

import java.util.TreeMap;

public class LeastKeyTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <Integer,String>tm=new TreeMap<Integer,String>();
		tm.put(214,"ruchi");
		tm.put(215,"ruhi");
		tm.put(216,"rachi");
		tm.put(217,"rasi");
		tm.put(218,"ruhina");
		tm.put(219,"rami");
		tm.put(220,"raimna");
		System.out.println(tm);
		System.out.println("Keys greater than or equal to 214: "+tm.ceilingKey(214));
		System.out.println("Keys greater than or equal to 220: "+tm.ceilingKey(220));

	}

}
