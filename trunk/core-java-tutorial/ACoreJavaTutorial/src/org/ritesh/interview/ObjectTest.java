package org.ritesh.interview;

public class ObjectTest {

	/**
	 * @param args
	 */
	String name;
	int id;

	
	public ObjectTest(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


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
		ObjectTest other = (ObjectTest) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectTest test = new ObjectTest("Ritesh",1);
		ObjectTest test2 = new ObjectTest("Ritesh",1);
		System.out.println(test.equals(test2));
		System.out.println(test.hashCode()+"   "+test2.hashCode());
	}

}
