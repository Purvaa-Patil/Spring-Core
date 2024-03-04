package edu.jsp.diSetter.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.diSetter.bean.Loan;

public class LoanTest {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext configurableApplicationContext =new ClassPathXmlApplicationContext("configprop.xml");
		
		Loan loan=(Loan)configurableApplicationContext.getBean("loan");
		loan.display();
	}
}
