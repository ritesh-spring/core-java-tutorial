package org.ritesh.scjp.tk;

interface Foo1 {
	int bar();
}

public class Q16 {

	/**
	 * @param args
	 */
	class A implements Foo1 {
		public int bar() {
			return 1;
		}
	}

	public int fubar(Foo1 foo1) {
		return foo1.bar();
	}

	public void testFoo1() {

		/*class A implements Foo1 {
			public int bar() {
				return 2;
			}
		}*/

		System.out.println(fubar(new A()));
	}
//	final static int[] a = new int[] { 100,200 };
	static final int[] a;
	static { a=new int[2]; a[0]=100; a[1]=200; }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q16().testFoo1();
		int x[]={0,1,2,3,4};
		int y[]=x;
		System.out.println(y[3]);
		System.out.println(a[1]);
	}

}
