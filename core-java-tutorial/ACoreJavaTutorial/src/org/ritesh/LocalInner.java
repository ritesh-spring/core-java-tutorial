package org.ritesh;

public class LocalInner {

	private int k = 10;

	void show() {
		final int m=15;
		class Inner {
			void display() {
				final int p=11;
				System.out.println("I am in Inner Class Display Method.." + k+" "+(p+m));
			}
		}
		Inner i = new Inner();
		i.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInner localInner = new LocalInner();
		localInner.show();
	}

}
