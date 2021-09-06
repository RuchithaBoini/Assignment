package com.src;

import java.util.PriorityQueue;

public class RetrieveRemovePQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();  
		pq.add(27);
	    pq.add(20);
	    pq.add(12);
	    pq.add(7);
	    pq.add(99);
	    pq.add(10);
	    pq.add(19);
	    pq.add(25);
	    pq.add(24);
	    System.out.println("Priority Queue contains: "+pq);
	    System.out.println("Removes first element of the Queue: "+pq.poll());
	    System.out.println("Priority Queue after removing first element: "+pq);

	}

}
