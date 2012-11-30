package org.ritesh.string.email;

public class EmailOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String email="Ritesh.Kumar@y7mail.com.in";
char amPersand='@';
String dotCom=".com";
System.out.println(email.indexOf(amPersand));
System.out.println(email.indexOf(dotCom));
String[] a1=email.substring(0,email.indexOf(amPersand)).split("\\.");
for(String s:a1)
{
System.out.println(s);	
}

String[] a2=email.substring(email.indexOf(amPersand)+1).split("\\.");
for(String s2:a2)
{
System.out.println(s2);	
}

	}

}
