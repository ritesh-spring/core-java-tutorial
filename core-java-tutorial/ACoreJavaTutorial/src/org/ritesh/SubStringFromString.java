package org.ritesh;

public class SubStringFromString {

	/**
	 * @param args
	 */
	static {
		System.out.println("I am in Static Block");
	}
	{
		System.out.println("I am not in Static Block");
	}

	void printMsg() {
		System.out.println("I am in Method Print Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubStringFromString string = new SubStringFromString();
		SubStringFromString string2 = new SubStringFromString();
		SubStringFromString string3 = new SubStringFromString();
		string.printMsg();
		string2.printMsg();
		string3.printMsg();
	}

}
