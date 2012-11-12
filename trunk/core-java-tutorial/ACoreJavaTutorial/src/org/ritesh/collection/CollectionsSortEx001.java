package org.ritesh.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsSortEx001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("Ritesh");
		al.add("Ramesh");
		al.add("Apple");
		al.add("Ball");
		al.add("Cat");

		Collections.sort(al);
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
		System.out.println("Sorting Wrapper Class Objects....");
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(Integer.valueOf(10));
		al2.add(Integer.valueOf(15));
		al2.add(Integer.valueOf(8));
		al2.add(Integer.valueOf(21));
		al2.add(Integer.valueOf(5));
		 Collections.sort(al2);
		 System.out.println(al2);
	}

}
