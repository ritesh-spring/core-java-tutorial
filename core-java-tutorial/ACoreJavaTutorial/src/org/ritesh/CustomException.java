package org.ritesh;

class InvalidAgeException extends Exception
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidAgeException(String s) {
	// TODO Auto-generated constructor stub
	super(s);
}	
}

public class CustomException
{
 static void validateAge(int age)throws InvalidAgeException
 {
	 if(age < 18)
	 {
		 throw new InvalidAgeException("Age Less than 18");
	 }
	 else {
		 System.out.println("Welcome to Voting Community...");
	 }
 }

public static void main(String[] args) {
	try {
		validateAge(13);
	} catch (Exception e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		System.out.println("Exception Caught...");
	}
	System.out.println("Normal Execution...");
}
}