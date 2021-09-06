package com.src;

import java.util.ArrayList;

public class RetrieveArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Strings");
		alist.add("Integer");
		alist.add("Character");
		alist.add("Boolean");
		alist.add("Double");
		alist.add("Float");
		System.out.println(alist.get(0));//retrieving 0th element
		System.out.println(alist.get(4));//retrieving 4th element

	}

}
