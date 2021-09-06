package com.src;

import java.util.ArrayList;
import java.util.List;

public class IterateItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=new ArrayList<String>();
		ls.add("xyz");
		ls.add("abc");
		ls.add("pqr");
		ls.add("uvw");
		ls.add("mno");
		for(String element:ls) {
			System.out.println(element);
		}
		
		

	}

}
