package edu.jsp.diSetter.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.diSetter.bean.User;

public class UserTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("userconfig.xml");
		
		User user= (User) context.getBean("user");
		
		System.out.println(" USER ID : "+user.getId());
		System.out.println(" USER NAME : "+user.getName());
		System.out.println(" USER EMAIL : "+user.getEmail());
		System.out.println(" USER PASSWORD : "+user.getPassword());
		
		
	}

}
