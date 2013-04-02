package org.ritesh.jaxb.p2;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("d:/xml/question.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Question q = (Question) jaxbUnmarshaller.unmarshal(file);
			System.out.println(q.getId() + " " + q.getQuestionName());
			System.out.println("Answewrs:");
			List<Answer> ans = q.getAnswer();
			for (Answer an : ans) {
				System.out.println(an.getId() + "  " + an.getAnswerName()
						+ "  " + an.getPostedBy());
			}
		} catch (JAXBException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
