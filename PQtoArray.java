package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PQtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>(); 
        pq.add("R");
        pq.add("U");
        pq.add("C");
        pq.add("H");
  System.out.println("Priority Queue: "+pq);
 
 
 List<String> arraylist = new ArrayList<String>(pq);
 System.out.println("Array containing all of the elements in the queue: "+arraylist);
  
 }    


	}


