package org.ritesh.pattern.singleton.phonebookex;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {

	private Map<Long, String> contacts = Collections
			.synchronizedMap(new TreeMap<Long, String>());
	private static PhoneBook instance = new PhoneBook();

	private PhoneBook() {
	}

	public static PhoneBook getInstance() {
		return instance;
	}

	public void addContact(Long number, String name) {
		contacts.put(number, name);
	}

	public boolean editContact(Long oldNumber, Long newNumber, String name) {
		if (contacts.containsKey(oldNumber)) {
			contacts.remove(oldNumber);
			contacts.put(newNumber, name);
			return true;
		}
		return false;
	}

	public void viewContacts() {
		Set<Map.Entry<Long, String>> set = contacts.entrySet();
		Iterator<Map.Entry<Long, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<java.lang.Long, java.lang.String> entry = (Map.Entry<java.lang.Long, java.lang.String>) it
					.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
