package org.ritesh.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Ball");
		set.add("Cat");
		set.add("Dog");
		set.add("Elephant");
		set.add("Cat");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string + " ,");
		}
System.out.println(set.size());
	}

}
