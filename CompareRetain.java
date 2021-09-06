
package com.src;

import java.util.HashSet;

public class CompareRetain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("xyz");
		hs.add("abc");
		hs.add("pqr");
		hs.add("uvw");
		System.out.println("First hashset content:"+hs);
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("123");
		hs1.add("456");
		hs1.add("234");
		hs1.add("567");
		hs1.add("897");
		System.out.println("Second hashset content:"+hs1);
		hs.retainAll(hs1);
		System.out.println("Hashset content:"+hs);
		System.out.println(hs);
}

}
