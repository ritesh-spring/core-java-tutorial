package org.ritesh.interview;

import java.lang.reflect.Method;

public class InvokePrivateMethodOutSideClass {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	Object o=Class.forName("org.ritesh.interview.A1").newInstance();
	Method m=A1.class.getDeclaredMethod("showMessage");
	m.setAccessible(true);
	m.invoke(o);

	}

}
