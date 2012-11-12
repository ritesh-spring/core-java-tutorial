package org.ritesh.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx003addAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Collection Example from Ritesh..........");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ritesh Kumar");
		list.add("Amit Kumar");
		list.add("Sumit Kumar");
		list.add("Piyush Kumar");
		list.add("Amay Rnajan");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ritesh Kumar");
		list2.add("Amit Kumar");
		list.addAll(list2);
		Iterator<String> it1 = list.iterator();
		while (it1.hasNext()) {
			String string = (String) it1.next();
			System.out.print(string + ",");

		}
		System.out.println();
		list.removeAll(list2);
		Iterator<String> it2 = list.iterator();
		while (it2.hasNext()) {
			String string = (String) it2.next();
			System.out.print(string + " ,");

		}
		System.out.println();
		list.retainAll(list2);
		System.out.println(list);
	}

}
