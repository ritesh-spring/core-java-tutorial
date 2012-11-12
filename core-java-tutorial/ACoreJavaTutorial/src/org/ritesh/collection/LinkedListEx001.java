package org.ritesh.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Ritesh Kumar");
		linkedList.add("Amit Kumar");
		linkedList.add("Sumit Kumar");
		linkedList.add("Vivek Kumar");
		linkedList.add("Piyush Prabhakar");

		Iterator<String> it1 = linkedList.iterator();

		while (it1.hasNext()) {
			String string = (String) it1.next();
			System.out.println(string + " ,");
		}
	}

}
