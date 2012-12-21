package org.ritesh.interview.veriFone;

public class Student {

	/**
	 * @param args
	 */
	String name;
	int id;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	 public Student(String name,int id) {
		this.name = name;
		this.id=id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Ritesh",1);
		Student student2 = new Student("Ritesh",1);
		System.out.println(student.equals(student2));
	}

}
