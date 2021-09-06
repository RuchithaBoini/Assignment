package com.src;


import java.util.Arrays;
import java.util.List;

public class ForEachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=Arrays.asList(20,27,7,12,99);
		System.out.println(al);
		al.forEach(o->System.out.println(o));
		al.forEach(System.out::println);

	}

}
