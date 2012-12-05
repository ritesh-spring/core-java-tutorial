package org.ritesh.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class SubSetFromSortedSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<>();
		ts.add("RED");
		ts.add("ORANGE");
		ts.add("BLUE");
		ts.add("GREEN");
		ts.add("WHITE");
		ts.add("BROWN");
		ts.add("YELLOW");
		ts.add("BLACK");
		System.out.println(ts);
		Set<String> subSet = ts.subSet("GREEN",true, "WHITE",true);
		System.out.println("sub set: " + subSet);
		/*subSet = ts.subSet("GREEN", true, "WHITE", true);
		System.out.println("sub set: " + subSet);
		subSet = ts.subSet("GREEN", false, "WHITE", true);
		System.out.println("sub set: " + subSet);*/
	}

}
