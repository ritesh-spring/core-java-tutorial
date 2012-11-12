package org.ritesh.collection;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapEx002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(5, null);
		/*
		 * hm.put(null, "Rakesh"); hm.put(null, "Apple"); hm.put(null, "Amit");
		 * hm.put(null, null);
		 */
		hm.put(1, "Apple");
		hm.put(2, "Ball");
		hm.put(3, "Bal");
		hm.put(4, "Cat");
		System.out.println(hm);
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);
		System.out.println("After Sorting...");
		System.out.println(tm);

	}

}
