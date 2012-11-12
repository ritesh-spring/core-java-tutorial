package org.ritesh;


public class SimpleThrow {

	static void validate(int age)
	{
		if(age < 10)
		{
			throw new ArithmeticException("Under Age are Not Allowed:"+age);
			
		}
		else
		{
			System.out.println("Age allowed Vote Here: "+age);	
			throw new NullPointerException("Riteshhh");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
validate(19);
System.out.println("Rest Code...");
		
	}

}
