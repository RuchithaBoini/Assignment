package com.src;

import java.util.ArrayList;
import java.util.List;

public class UpdateArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=new ArrayList<String>();
		ls.add("xyz");
		ls.add("abc");
		ls.add("pqr");
		ls.add("uvw");
		ls.add("mno");
		System.out.println(ls);
		ls.set(3, "def");
		System.out.println(ls);

	}

}
