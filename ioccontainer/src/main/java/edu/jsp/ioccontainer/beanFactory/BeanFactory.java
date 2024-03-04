package edu.jsp.ioccontainer.beanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import edu.jsp.ioccontainer.bean.Student;

public class BeanFactory {
	
public static void main(String[] args) {
	Resource resource= new ClassPathResource("config.xml");
	XmlBeanFactory factory = new XmlBeanFactory(resource);
	
	Student student = (Student) factory.getBean("myStudent");
	Student student1=factory.getBean(Student.class);
	
	student.greet();
	student1.greet();
}
}
