package org.ritesh.interview.ness;

import java.io.IOException;

public class TestStringLength {

	/**
	 * @param args
	 */
	public static int method() {
        try {
            //throw new Exception();
            return 1;
        } catch (Exception e) {
            return 2;
        } 
        finally {
            //return 3;
        }
	}
	boolean m1() {
		try {
			//System.out.println("In try ");
			
			throw new IOException();
            } 
		finally {
			//System.out.println("In Finally");
			throw new NullPointerException();
			}

		}
	

	void m() {
		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str = null; System.out.println(str.length());
		 */
		TestStringLength length = new TestStringLength();
		System.out.println(TestStringLength.method());
		length.m();
	}

}
