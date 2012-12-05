package org.ritesh.interview.sorting;

import java.util.Arrays;

public class IntegerArrayMaxVal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 5, 10, 1, 55, 10, 45 };
		Arrays.sort(a);
		System.out.println(a[a.length - 1]);

		String str[] = { "Ritesh", "Apple", "Ball", "Cat", "Zebra", "Ramesh" };
		Arrays.sort(str);
		for (String s : str)
			System.out.println(s);
	}

}
