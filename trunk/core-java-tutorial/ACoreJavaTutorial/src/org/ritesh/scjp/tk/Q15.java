package org.ritesh.scjp.tk;

interface Foo {
	int bar();
}

public class Q15 {

	/**
	 * @param args
	 */
	public int fubar(Foo foo) {
		return foo.bar();
	}

	public void testFoo() {
		fubar(new Foo() {
			public int bar() {
				return 1;
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q15 q15 = new Q15();
//		System.out.println(q15.testFoo());
	}

}
