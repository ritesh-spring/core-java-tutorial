package org.ritesh;

import java.util.ArrayList;
import java.util.List;

public class ListReference {

	/**
	 * @param args
	 */
	void showList(List<String> l) {
		l.add("One");
	}

	void showList() {
		List<String> l = new ArrayList<String>();
		l.add("Two");
		System.out.println(l.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListReference listReference = new ListReference();
		listReference.showList();
	}

}
