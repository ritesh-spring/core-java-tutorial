package org.ritesh;

import java.io.IOException;

public class Simple5 {
	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		Simple5 obj = new Simple5();
		obj.p();
		System.out.println("normal flow...");
	}
}