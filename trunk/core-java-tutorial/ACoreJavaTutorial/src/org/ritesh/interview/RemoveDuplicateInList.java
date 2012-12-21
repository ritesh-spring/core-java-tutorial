package org.ritesh.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateInList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = new ArrayList<>();
		str.add("one");
		str.add("two");
		str.add("three");
		str.add("four");
		str.add("five");
		str.add("six");
		str.add("seven");
		str.add("eight");
		str.add("One");
		str.add("two");
		str.add("three");
		str.add("four");
		// Set<String> set=new HashSet<>(str);
		Set<String> set = new LinkedHashSet<>(str);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}

		Set<String> set1 = new HashSet<>();
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add("four");
		set1.add("one");
		set1.add("two");
		set1.add("three");
		System.out.println(set1);
	}

}
