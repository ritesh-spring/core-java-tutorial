package org.ritesh.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<String>();

		set.add("Rahul");
		set.add("Amit");
		set.add("Piyush");
		set.add("1234");
		set.add("12345");
		set.add("Ritesh");
		set.add("Rakesh");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string + " ,");

		}
	}

}
