package edu.jsp.initDestroyMethod.test;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.initDestroyMethods.bean.Subscription;

public class SubscriptionTest {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 Subscription subscription= (Subscription) context.getBean("subs");
		 
		 context.close();
	}
}
