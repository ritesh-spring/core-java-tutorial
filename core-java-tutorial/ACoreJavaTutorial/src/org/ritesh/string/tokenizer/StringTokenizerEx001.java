package org.ritesh.string.tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx001 {

	/**
	 * @param args
	 */
	static String in = "ritesh_kumar@y7mail.com"; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringTokenizer st=new StringTokenizer(in,"=;- . @_");
while (st.hasMoreTokens()) {
	String s=st.nextToken();
	System.out.println(s);
}
	}

}
