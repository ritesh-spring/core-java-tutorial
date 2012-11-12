package org.ritesh.pattern.singleton.ex01;
 
public class UseSingleTon {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// SingleTon.getInstance().doSomething();
		SingleTon st = SingleTon.getInstance();
		st.doSomething();
		SingleTon st1 = SingleTon.getInstance();
		st1.doSomething2();
		
		try {
			SingleTon st2=(SingleTon) st.clone();
			st2.doSomething();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
