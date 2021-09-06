package com.src;

import java.util.PriorityQueue;

public class PQtoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>(); 
        pq.add("R");
        pq.add("U");
        pq.add("C");
        pq.add("H");
  System.out.println("Priority Queue: "+pq);
  String str1;
  str1 = pq.toString();

  System.out.println("String representation of the Priority Queue: "+str1);    

 

	}

}
