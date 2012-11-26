package org.ritesh.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ritesh Kumar");
		list.add("Rakesh");
		list.add("Amit Kumar");
		list.add("Sumit");
		list.add("Ganith");
		list.add("Kavita");
		list.add("Nirmala Culli");
		list.add("Nirmala Bhauji");
		list.add("Sunil Gandu");
		list.add("Amit Gandu");

		// System.out.println(list);

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.print(string+",");

		}
		System.out.println();
for (String string : list) {
	System.out.print(string+",");
}
	}

}
