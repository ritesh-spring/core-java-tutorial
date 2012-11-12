package org.ritesh;

public class OuterClass {

	private int data = 30;

	public class InnerClass {
		private int data1 = 10;

		void show() {

			System.out.println("Data Value is: " + data + "  " + data1);
		}
	}

	void display() {
		InnerClass class1 = new InnerClass();
		class1.show();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass oi = (new OuterClass()).new InnerClass();
		oi.show();
		System.out.println("Data in Inner Class is: " + oi.data1);
		oc.display();
	}

}
