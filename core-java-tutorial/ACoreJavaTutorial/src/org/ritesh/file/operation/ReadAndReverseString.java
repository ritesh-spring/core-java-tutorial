package org.ritesh.file.operation;

import java.io.BufferedReader;
import java.io.FileWriter;
//import java.io.EOFException;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ReadAndReverseString {

	/**
	 * @param args
	 */
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
try {
	FileReader fr=new FileReader("d:/input.txt");
	BufferedReader br=new BufferedReader(fr);
	FileWriter fw=new FileWriter("d:/out.txt");
	String s="";
//	String[] s1;
	while((s=br.readLine()) !=null)
		{
//		System.out.println(s);
		
		StringTokenizer st=new StringTokenizer(s," \".- ,;");
		while (st.hasMoreTokens()) {
			count++;
			String ss=st.nextToken();
			sb.append(ss);
			for(int i=ss.length()-1; i >= 0;i--)
			{
			char ch=ss.charAt(i);
				fw.write(ch);
//			System.out.println(ch);
			}
			fw.write(" ");
			sb.append("\n");
		}
		}
	System.out.println(sb.reverse());
	br.close();
	fw.close();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println(count);
	}

}
