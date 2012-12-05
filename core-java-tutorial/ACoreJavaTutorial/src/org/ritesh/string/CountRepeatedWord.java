package org.ritesh.string;

public class CountRepeatedWord {
	static int j=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userString = "user is The enemy of The system";
		String key = "The";

		while(userString.length() >0)
		{
		if((userString.substring(0, userString.length()-1)==key))
		{
		j++;
		}}

		System.out.println("Occurences : "+j);
	}

}
