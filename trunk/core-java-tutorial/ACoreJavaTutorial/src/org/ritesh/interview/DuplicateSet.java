package org.ritesh.interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateSet {

	/**
	 * @param args
	 */
Set<String> set;
	
	public Set<String> getSet() {
		set=new HashSet<>();
		set.add("Ritesh");
		set.add("Ritesh");
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((set == null) ? 0 : set.hashCode());
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
		DuplicateSet other = (DuplicateSet) obj;
		if (set == null) {
			if (other.set != null)
				return false;
		} else if (!set.equals(other.set))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DuplicateSet set2 = new DuplicateSet();
 System.out.println(set2.getSet());

	}

}
