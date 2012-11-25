package org.ritesh;


public class Simple
{
	void m()
	{
//	int data=40/0;	
	}
	void n()
	{
		m();
	}
	void p()
	{
		
				n();
			
	}
public static void main(String[] args) {
	
	Simple q=new Simple();
	try {
		q.p();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
		e.printStackTrace();
	}
	System.out.println("Smooth Execution...");
}
	
}
