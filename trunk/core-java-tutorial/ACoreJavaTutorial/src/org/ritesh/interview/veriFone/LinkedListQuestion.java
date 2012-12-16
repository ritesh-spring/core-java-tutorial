package org.ritesh.interview.veriFone;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

}

class IDComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.id == o2.id)
			return 0;
		if (o1.id > o2.id)
			return 1;
		else
			return -1;
	}

}
class SalaryComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.salary == o2.salary)
			return 0;
		if (o1.salary > o2.salary)
			return 1;
		else
			return -1;
	}

}
public class LinkedListQuestion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new LinkedList<Employee>();
		list.add(new Employee(5, "Aditya Kumar", 234453.89));
		list.add(new Employee(1, "Ritesh Kumar", 1234.04));
		list.add(new Employee(2, "Kumar", 23456.00));
		list.add(new Employee(3, "Sanjeev Kumar", 45530.90));
		list.add(new Employee(8, "Amit Kumar", 2345.9));
		list.add(new Employee(4, "Gaurav Kumar", 3342556.2));
	
		Collections.sort(list, new SalaryComparator());
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee employee = (Employee) it.next();
			System.out.println(employee);
		}

	}

}
