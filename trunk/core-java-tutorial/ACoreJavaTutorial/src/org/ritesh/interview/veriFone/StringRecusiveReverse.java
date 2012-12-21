package org.ritesh.interview.veriFone;


public class StringRecusiveReverse {

	/**
	 * @param args
	 */
	public static String reverseMe(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; --i)
			builder.append(s.charAt(i));
		return builder.toString();

	}

	public static String recursiveReverseString(String s) {
		if (s.length() == 0)
			return " ";
		return s.charAt(s.length() - 1)
				+ recursiveReverseString(s.substring(0, s.length() - 1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am Ritesh Kumar";
        
		String to = StringRecusiveReverse.reverseMe(s);
		String to1 = StringRecusiveReverse.recursiveReverseString(s);
		System.out.println(to);
        System.out.println(to1);
        /*StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens()) {
        	s1=st.nextToken(); 
        	System.out.println(s1);
        }*/
        String[] s1=s.split(" ");
        
        for(int i=s1.length-1;i>=0;i--)
        	System.out.println(s1[i]);
	}

}
