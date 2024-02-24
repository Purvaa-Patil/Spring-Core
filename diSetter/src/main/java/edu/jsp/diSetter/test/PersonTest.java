package edu.jsp.diSetter.test;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.diSetter.bean.Mobile;
import edu.jsp.diSetter.bean.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("personconfig.xml");
		
		Person person= (Person) context.getBean("person");
		Mobile mobile = person.getMobile();
		
		System.out.println(" ID : "+person.getId());
		System.out.println(" NAME : "+person.getName());
		System.out.println(" -----------------------------------");
		System.out.println(" MOBILE ID : "+mobile.getId());
		System.out.println(" MOBILE NAME : "+mobile.getName());
		System.out.println(" MOBILE MODEL : "+mobile.getModel());

	}

}
