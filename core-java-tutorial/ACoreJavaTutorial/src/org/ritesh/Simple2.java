package org.ritesh;

public class Simple2 {
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		n();
	}

	public static void main(String args[]) {
		Simple2 obj = new Simple2();
		try {
			obj.p();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Handled....");
//			e.printStackTrace();
		}
		System.out.println("normal flow...");
	}
}