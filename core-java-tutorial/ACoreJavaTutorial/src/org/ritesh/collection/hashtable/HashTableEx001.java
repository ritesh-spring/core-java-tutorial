package org.ritesh.collection.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;


public class HashTableEx001 {

	/**
	 * @param args
	 */
	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
		ht.put(1, "Ritesh");
		ht.put(2, "Rakesh");
		ht.put(3, "Apple");
		ht.put(4, "Ball");
		ht.put(5, "Cat");
		ht.put(6, "Elephant");
		ht.put(6, "Flower");
		ht.put(6, "Grapes");
		// System.out.println(ht.values());
		/*Set<Entry<Integer, String>> set = ht.entrySet();

		Iterator<Map.Entry<Integer, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) it
					.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}*/
		
		Enumeration<String> em=ht.elements();
		System.out.println();
		while (em.hasMoreElements()) {
			String string = (String) em.nextElement();
			System.out.println(i+"= " +string);
			i=i+1;
		}
		
		
	}

}
