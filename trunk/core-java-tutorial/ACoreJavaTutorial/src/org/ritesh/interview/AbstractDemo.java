package org.ritesh.interview;

abstract class Demo
{
	static int i=10;
	public Demo()
	{
		System.out.println("I am Ritesh Kumar");
		Demo.i=11;
	}
}
public class AbstractDemo extends Demo{

	/**
	 * @param args
	 */
	AbstractDemo()
	{
		super();
		System.out.println("I am in Sub Class");
	}
	void print1()
	{
		System.out.println("I am in Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractDemo d=new AbstractDemo();
System.out.println(Demo.i);
d.print1();
	}

}
