package org.ritesh.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class HashMapEx001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> hm=new HashMap<>();
 hm.put("Ritesh", 10);
 hm.put("Apple", 123);
 hm.put("Ramesh", 300);
 hm.put("Rupesh", 1000);
// System.out.println(hm);
 Set<Map.Entry<String,Integer>> set=hm.entrySet();
 Iterator<Map.Entry<String,Integer>> it=set.iterator();
 while (it.hasNext()) {
	Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) it
			.next();
	System.out.println(entry);
	
}
 System.out.println("After Sorting....");
	TreeMap<String, Integer> m1=new TreeMap<>(hm);
	System.out.println(m1);
	}

}
