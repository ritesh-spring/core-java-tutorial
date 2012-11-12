package org.ritesh.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new LinkedHashSet<>();
		set.add("Apple");
		set.add("Ball");
		set.add("Cat");
		set.add("Dog");
		set.add("Elephant");
		set.add("Ball");

		Iterator<String> li = set.iterator();
		while (li.hasNext()) {
			String string = (String) li.next();
			System.out.println(string + " ,");

		}
		System.out.println(set.size());
	}

}
