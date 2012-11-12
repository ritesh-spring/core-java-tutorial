package org.ritesh.collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int roll;
	String name;
	int age;

	public Student(int roll, String name, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age
				+ "]";
	}

}

public class ArrayListEx002StoringData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1, "Ritesh Kumar", 25);
		Student student2 = new Student(2, "Rakesh Kumar", 19);
		Student student3 = new Student(3, "Amit Gandu", 22);
		Student student4 = new Student(4, "Piyush Prabhakar", 31);
		Student student5 = new Student(5, "Sanjeev Kuamar", 23);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(student);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		Iterator<Student> it=list.iterator();
		while (it.hasNext()) {
//			Student student6 = (Student) it.next();
			System.out.println(it.next());
		}
		System.out.println("Using ForEach Loop...");
for (Student student6 : list) {
	System.out.println(student6);
}
	}

}
