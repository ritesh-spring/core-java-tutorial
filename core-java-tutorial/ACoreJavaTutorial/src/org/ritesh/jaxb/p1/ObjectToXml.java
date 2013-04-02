package org.ritesh.jaxb.p1;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class ObjectToXml {
	public static void main(String[] args)throws Exception {
		try {
			JAXBContext contextObj = JAXBContext.newInstance(Employee.class);
			Marshaller marshallerObj = contextObj.createMarshaller();
			marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			Employee emp1 = new Employee(1, "Ritesh Kumar", 2334);
			Employee emp2 = new Employee(2, "Ramesh Kumar", 2354);
			marshallerObj.marshal(emp1, new FileOutputStream("d:/xml/employee1.xml"));
			marshallerObj.marshal(emp2, new FileOutputStream("d:/xml/employee2.xml"));
			System.out.println("File Generated....");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
