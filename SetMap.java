package com.src;

import java.util.HashMap;
import java.util.Set;

public class SetMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(214,"ruchi");
		hm.put(215,"ruhi");
		hm.put(216,"rachi");
		hm.put(217,"rasi");
		hm.put(218,"ruhina");
		hm.put(219,"rami");
		hm.put(220,"raimna");
		Set s=hm.entrySet();
		System.out.println("SetMap view is:"+s);

	}

}
