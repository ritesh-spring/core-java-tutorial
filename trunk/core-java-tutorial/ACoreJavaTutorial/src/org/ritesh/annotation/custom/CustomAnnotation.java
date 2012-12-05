package org.ritesh.annotation.custom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation
{
String name();
String disc();
}

public class CustomAnnotation {

	/**
	 * @param args
	 */
	
	@MyAnnotation(name="Ritesh Kumar", disc="Developed by Ritesh")
	public void myMethod()
	{
		try {
			System.out.println(MyAnnotation.class.newInstance().disc());
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MyAnnotation ma=new MyAnnotation() {
			
			@Override
			public Class<? extends Annotation> annotationType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String name() {
				// TODO Auto-generated method stub
				return "Ritesh Kumar";
			}
			
			@Override
			public String disc() {
				// TODO Auto-generated method stub
				return "Developed by Ritesh";
			}
		};
		System.out.println(ma.disc()+" "+ma.name());
*/
		CustomAnnotation ca=new CustomAnnotation();
		ca.myMethod();
	}

}
