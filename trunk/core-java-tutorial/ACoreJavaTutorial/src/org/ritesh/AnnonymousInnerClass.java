package org.ritesh;

/**
 * @author Ritesh Kumar
 * 
 */
interface Eatable {
	int p = 10;

	void eat();
}

abstract class Person {
	abstract void show();

	int k = 10;
}

public class AnnonymousInnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Eatable() {
			public void eat() {
				System.out.println("I am Eating..." + p);
			}
		}).eat();
		(new Person() {
			void show() {
				System.out.println("My Name is Ritesh..." + k);
			}
		}).show();
	}

}
