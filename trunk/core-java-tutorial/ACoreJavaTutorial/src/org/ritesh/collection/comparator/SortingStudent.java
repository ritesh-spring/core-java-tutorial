package org.ritesh.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(10, 15, "Ritesh Kumar"));
		al.add(new Student(25, 33, "Nirmala Bhauji"));
		al.add(new Student(20, 23, "Appple"));
		al.add(new Student(99, 23, "Cat"));
		al.add(new Student(11, 45, "Rakesh Kumar"));
		al.add(new Student(5, 27, "Elephant"));

		System.out.println("Sorting By Name....");
		Collections.sort(al, new NameComparator());
		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student student = (Student) it.next();
			System.out.println(student);
		}
		
		System.out.println("Sorting By Age");
		Collections.sort(al, new AgeComparator());
		Iterator<Student> it2=al.iterator();
		
		while (it2.hasNext()) {
			Student student = (Student) it2.next();
			System.out.println(student);
		}
	}

}
