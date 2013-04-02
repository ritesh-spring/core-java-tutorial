package org.ritesh.interview;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> l = new TreeMap<>();
		l.put("Ball", "Mango");
		l.put("Ritesh", "Amit");
		l.put("Ball", "Cat");
		l.put("Raat", "Dog");

		System.out.println(l);
		TreeSet<String> ts=new TreeSet<>();
		
		ts.add("Rat");
		ts.add("Apple");
		ts.add("Banana");
		ts.add("Apple");
		System.out.println(ts.first());
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ritesh");
		list.add("Ramesh");
		list.add("Rakesh");
		list.add("Rupesh");
		System.out.println(list);
		
	}

}
