package org.ritesh.interview;

abstract class Demo1
{
	static int i=10;
	public Demo1()
	{
		System.out.println("I am Ritesh Kumar");
		Demo.i=11;
	}
}
public class AbstractDemo1 extends Demo1{

	/**
	 * @param args
	 */
	AbstractDemo1()
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
AbstractDemo1 d=new AbstractDemo1();
System.out.println(Demo.i);
d.print1();
	}

}
