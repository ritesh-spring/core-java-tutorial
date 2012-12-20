package org.ritesh;

class B
{
B()
{
System.out.println("B");	
}
}
public class A {

	/**
	 * @param args
	 */
	void m()
	{
		System.out.println("I am in Method m()..");
	}
	B b=new B();
	A()
	{
		System.out.println("A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
a.m();
	}

}
