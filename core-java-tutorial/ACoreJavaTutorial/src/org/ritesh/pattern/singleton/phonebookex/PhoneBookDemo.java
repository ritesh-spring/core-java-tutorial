package org.ritesh.pattern.singleton.phonebookex;

public class PhoneBookDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook phBook = PhoneBook.getInstance();
		phBook.addContact(9938695303L, "Ritesh Kumar");
		phBook.addContact(9658330530L, "Rashmita Kumari");
		phBook.addContact(9739112233L, "Nirmala Bhauji");
		phBook.addContact(9431009867L, "Rishi Ranjan");
		phBook.viewContacts();
		boolean result = phBook.editContact(9938695303L, 9448001122L,
				"Ritesh Kumar Singh");
		if (result)
			System.out.println("Contact Edited....");
		else
			System.out.println("Contact not Edited.....");
		PhoneBook pb=PhoneBook.getInstance();
		pb.viewContacts();
	}

}
