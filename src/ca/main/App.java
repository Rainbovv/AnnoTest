package ca.main;


import ca.main.objects.AbstractObject;

import ca.main.objects.ObjectFactory;

public class App {

	public static void main(String[] args) throws Exception {

		ObjectFactory objectFactory = ObjectFactory.getInstance();



		AbstractObject bDefault = objectFactory.getObject("B");
		AbstractObject b = objectFactory.getObject("B", 24);
		AbstractObject aDefault = objectFactory.getObject("A");

		System.out.println(bDefault);
//		System.out.println(b);
//		System.out.println(aDefault);


	}
}