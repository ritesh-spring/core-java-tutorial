package org.ritesh.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<String>();
list.add("Amit");
list.add("Ball");
list.add("Cat");
list.add("Dog");
list.add("Elephant");
System.out.println("Element at 4th Position: "+list.get(4));
System.out.println(list.set(0, "Maths"));
System.out.println("Element at 1st Position: "+list.get(0));
ListIterator<String> it1=list.listIterator();
System.out.println("Getting Element in Forward Direction: ");
 while (it1.hasNext()) {
	String string = (String) it1.next();
	System.out.println("Elements are: "+string+ ", ");
	
}
 it1.add("Rakesh");
// ListIterator<String> it2=list.listIterator();
System.out.println("Getting Elent in Backward Direction: ");
while (it1.hasPrevious()) {
	String string = (String) it1.previous();
	System.out.println(string+" ,");
	
}
System.out.println(list.size());
	}

}
