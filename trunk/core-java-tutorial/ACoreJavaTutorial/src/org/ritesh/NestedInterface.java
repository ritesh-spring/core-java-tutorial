package org.ritesh;

interface Showable {
	void show();

	interface Message {
		void msg();
	}
}

public class NestedInterface implements Showable.Message{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new NestedInterface().msg();
	}

	

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("How RE YOU?");
	}

}
