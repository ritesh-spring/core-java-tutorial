package org.ritesh;

public class UsefulPrograms {
//    int fact1;
	public static int factorial(int fact)
	{
		int i=1;
		while(i <= fact) {
			fact=i-1 * fact;
			i=fact;
		i--;
		}
		return fact;
	}
}
