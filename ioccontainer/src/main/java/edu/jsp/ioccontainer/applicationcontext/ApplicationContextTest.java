package edu.jsp.ioccontainer.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.ioccontainer.bean.Student;

public class ApplicationContextTest {

	public static void main(String[] args) {
		
		
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	
	Student student = (Student) context.getBean("myStudent");
	
	student.greet();
	
	}
}
