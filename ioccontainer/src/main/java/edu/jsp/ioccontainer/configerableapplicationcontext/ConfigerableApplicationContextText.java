package edu.jsp.ioccontainer.configerableapplicationcontext;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.ioccontainer.bean.Student;

public class ConfigerableApplicationContextText {

	
public static void main(String[] args) {
	
	ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	
	Student student = (Student) context.getBean("myStudent");
	student.greet();
}
}
