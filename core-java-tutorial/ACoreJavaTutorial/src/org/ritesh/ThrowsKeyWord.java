package org.ritesh;

import java.io.IOException;

public class ThrowsKeyWord {

	void m() throws IOException {
//		throw new IOException("Some Exception occured in M()");
	}

	void n() throws IOException {
		m();
	}

	void p()throws IOException{
		n();
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		ThrowsKeyWord throwsKeyWord = new ThrowsKeyWord();

		try {
			throwsKeyWord.p();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Exception Handeled...");
		}
		System.out.println("Normal Execution....");
	}

}
