package org.ritesh.interview.veriFone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteInFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileReader fr=new FileReader("D:/input1.txt");
	FileWriter fw=new FileWriter("d:/output1.txt");
	BufferedReader reader = new BufferedReader(fr);
	String s;
	while((s=reader.readLine())!=null)
	{
		fw.write(s);
	}	
	System.out.println("Data Written to a File...");
	fr.close();
	fw.close();
	reader.close();
} 
catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
