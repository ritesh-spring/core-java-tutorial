package org.ritesh;

public class StaticInner {

	static int data = 30;
	
	static void outerShow()
	{
		System.out.println(" I am in OuterShow Method");
	}

	static class Inner {
		static void show() {
			System.out.println("Data in Outer Class is :" + data);
//			StaticInner s0=new StaticInner();
//			s0.outerShow();
			StaticInner.outerShow();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StaticInner.Inner si = new StaticInner.Inner();
		StaticInner.Inner.show();
	}

}
