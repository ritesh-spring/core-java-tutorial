package org.ritesh.sapient;

class A1
{
	static int x=10; int a=20;	
	static int y=50;
}
public class B1 extends A1 {

	/**
	 * @param args
	 */
	int a=30; static int x=30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A1 a=new A1(); 
		 A1 b=new B1(); 
		 System.out.println(a.x); //10
		 System.out.println(b.x); //30
		 System.out.println(b.a); //30
		 A1 c=new A1(); 
		 System.out.println(c.x); //10
		 System.out.println(c.a); //20
		 System.out.println(b.y);
	}

}
