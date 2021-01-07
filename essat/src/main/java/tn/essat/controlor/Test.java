package tn.essat.controlor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.essat.model.Livre;

public class Test {
	public static void main (String []args) {
		
		ApplicationContext actt=new ClassPathXmlApplicationContext("Context2.xml");
		
		Livre l=actt.getBean("x1",Livre.class);
		System.out.println(l.getTitre());
		System.out.println(l.getCat().getLibele());

		
	}
	

}
