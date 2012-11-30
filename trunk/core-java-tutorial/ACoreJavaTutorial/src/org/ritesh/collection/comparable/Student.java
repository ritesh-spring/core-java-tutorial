package org.ritesh.collection.comparable;

public class Student implements Comparable<Object> {

	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student st=(Student) o;
		return name.compareTo(st.name); //In Ascending Order
		// In Descending Order return (st.name).compareTo(name)
		}

	@Override
	public String toString() {
		return "Student2 [rollNo=" + rollNo + ", name=" + name + ", age=" + age
				+ "]";
	}

	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student2 st=(Student2)o;
		if(rollNo== st.rollNo)
		return 0;
		 if(rollNo > st.rollNo)
			 return 1;
		 else 
			 return -1;
	}*/

}
