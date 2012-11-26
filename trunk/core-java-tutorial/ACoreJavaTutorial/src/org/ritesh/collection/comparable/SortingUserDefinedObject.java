package org.ritesh.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class SortingUserDefinedObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student2> al=new ArrayList<Student2>();
al.add(new Student2(1, "Ritesh Kumar", 22));
al.add(new Student2(2, "Ramesh Kumar", 25));
al.add(new Student2(13, "Sanjeev Kumar", 20));
al.add(new Student2(4, "Apple", 30));
al.add(new Student2(5, "Ball", 15));
Collections.sort(al);
Iterator<Student2> it=al.iterator();
while (it.hasNext()) {
	Student2 student2 = (Student2) it.next();
	System.out.println(student2);
}
	}

}
