package org.ritesh.scjp.tk;

public class Q33 {

	/**
	 * @param args
	 */
	private static int counter;
	public static int getInstanceCount() {
		return counter;
		 }
	Q33()
	{
		counter++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Title.MR.format("Doe", "John"));
		Object obj =new int[] { 1,2,3 };
		int[] someArray = (int[])obj;
		for (int i: someArray) 
			System.out.print(i +" ");
		/*Q33 q31 = new Q33();
		Q33 q32 = new Q33();
		Q33 q33 = new Q33();*/
		System.out.println("Instance Count="+Q33.getInstanceCount());
	}
}

   enum Title {
	    MR("Mr."), MRS("Mrs."), MS("Ms.");
	       private final String title;
            private Title(String t) {
		title = t;
	        }

	public String format(String last, String first) {
		return title + " " + first + " " + last;
	}
}
