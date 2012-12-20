package org.ritesh;

class A1 {
	public void show() {
		System.out.println("I am in class A1");
	}
}

class B1 extends A1 {
	public void show() {
		System.out.println("I am in class B1");
	}
}

public class ClassOverrideTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b1 = new B1();
		A1 a1;
		a1 = (A1) b1;
		a1.show();
	}

}
