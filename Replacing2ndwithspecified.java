package com.src;

import java.util.ArrayList;

public class Replacing2ndwithspecified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Telangana-0");
		alist.add("Tamilnadu-1");
		alist.add("Karnataka-2");
		alist.add("Arunachal Pradesh-3");
		alist.add("Delhi-4");
		System.out.println("ArrayList contains:"+alist);
		String c="Maharstra";
		alist.set(1, c);
		int num=alist.size();
		System.out.println("\nReplacing second element with ");
		for(int i=0;i<num;i++)
		{
			System.out.println(alist.get(i));
		}

	}

}
