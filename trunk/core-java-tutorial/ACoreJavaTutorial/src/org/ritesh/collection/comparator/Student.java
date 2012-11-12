package org.ritesh.collection.comparator;

public class Student {
	int rollNo, age;
	String name;

	

	public Student(int rollNo, int age, String name) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", name=" + name
				+ "]";
	}

}
