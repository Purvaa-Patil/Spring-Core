package edu.jsp.diSetter.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("subject.xml");
		
		Student student =(Student) context.getBean("Student");
		
		System.out.println(" ID : "+student.getId());
		System.out.println(" NAME : "+student.getName());
		System.out.println("===============================");
		
		for (String string : student.getSubject()) {
			
			System.out.println(string);
			
		}
		
	}

}
