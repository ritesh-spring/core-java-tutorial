package org.ritesh.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<>();

		pq.add("Ritesh");
		pq.add("Ramesh");
		pq.add("Apple");
		pq.add("Aapple");
		pq.add("Ball");
		pq.add("Cat");
		pq.add("Dog");
		System.out.println("Head:" + pq.element());
		System.out.println("Head:" + pq.peek());
		System.out.println("Iterating the Quee Elements: ");

		Iterator<String> it = pq.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string + " ,");
		}
       pq.remove();
       pq.poll();
       
       System.out.println("After Removing Two Elements: ");
       Iterator<String> it2=pq.iterator();
       while (it2.hasNext()) {
		String string = (String) it2.next();
		System.out.println(string+" ,");
		
	}
	}

}
