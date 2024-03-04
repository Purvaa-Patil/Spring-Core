package edu.jsp.ioccontainer.multibeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.ioccontainer.bean.Student;
import edu.jsp.ioccontainer.bean.Teacher;
import edu.jsp.ioccontainer.configerableapplicationcontext.ConfigerableApplicationContextText;

public class MultipleBeansTest {
	
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
		
		
		Student student1= (Student) context.getBean("myStudent1");
		Student student2= (Student) context.getBean("myStudent2");
		Teacher teacher1= (Teacher) context.getBean("myTeacher1");
		Teacher teacher2= (Teacher) context.getBean("myTeacher2");
		
		student1.greet();
		teacher1.teach();
		

		student2.greet();
		teacher2.teach();
}
}
